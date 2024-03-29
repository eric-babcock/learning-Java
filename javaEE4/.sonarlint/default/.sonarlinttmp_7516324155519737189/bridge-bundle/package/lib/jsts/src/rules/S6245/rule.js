"use strict";
/*
 * SonarQube JavaScript Plugin
 * Copyright (C) 2011-2024 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
// https://sonarsource.github.io/rspec/#/rspec/S6245/javascript
Object.defineProperty(exports, "__esModule", { value: true });
exports.rule = void 0;
const parameters_1 = require("../../linter/parameters");
const helpers_1 = require("../helpers");
const cdk_1 = require("../helpers/aws/cdk");
const s3_1 = require("../helpers/aws/s3");
const ENCRYPTED_KEY = 'encryption';
const messages = {
    unencrypted: 'Objects in the bucket are not encrypted. Make sure it is safe here.',
    omitted: 'Omitting "encryption" disables server-side encryption. Make sure it is safe here.',
};
exports.rule = (0, s3_1.S3BucketTemplate)((bucket, context) => {
    const encryptedProperty = (0, s3_1.getProperty)(context, bucket, ENCRYPTED_KEY);
    if (encryptedProperty == null) {
        context.report({
            message: (0, helpers_1.toEncodedMessage)(messages['omitted'], [], []),
            node: bucket.callee,
        });
        return;
    }
    const encryptedValue = (0, helpers_1.getValueOfExpression)(context, encryptedProperty.value, 'MemberExpression');
    if (encryptedValue && isUnencrypted(encryptedValue)) {
        const propagated = (0, s3_1.findPropagatedSetting)(encryptedProperty, encryptedValue);
        context.report({
            message: (0, helpers_1.toEncodedMessage)(messages['unencrypted'], propagated.locations, propagated.messages),
            node: encryptedProperty,
        });
    }
    function isUnencrypted(encrypted) {
        return ((0, cdk_1.normalizeFQN)((0, helpers_1.getFullyQualifiedName)(context, encrypted)) ===
            'aws_cdk_lib.aws_s3.BucketEncryption.UNENCRYPTED');
    }
}, {
    meta: {
        schema: [
            {
                // internal parameter for rules having secondary locations
                enum: [parameters_1.SONAR_RUNTIME],
            },
        ],
    },
});
//# sourceMappingURL=rule.js.map