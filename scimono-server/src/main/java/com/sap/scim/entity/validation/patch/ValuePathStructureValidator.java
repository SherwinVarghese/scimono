
package com.sap.scim.entity.validation.patch;

import com.sap.scim.entity.patch.PatchOperation;
import com.sap.scim.entity.validation.Validator;
import com.sap.scim.filter.QueryFilterParser;
import com.sap.scim.filter.patch.ValuePathStructureValidationVisitor;

public class ValuePathStructureValidator implements Validator<PatchOperation> {

  @Override
  public void validate(PatchOperation operation) {
    QueryFilterParser.parse(operation.getPath(), new ValuePathStructureValidationVisitor());
  }
}