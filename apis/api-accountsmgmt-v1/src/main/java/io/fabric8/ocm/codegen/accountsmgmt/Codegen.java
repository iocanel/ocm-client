package io.fabric8.ocm.codegen.accountsmgmt;

import io.sundr.builder.annotations.ExternalBuildables;

@ExternalBuildables(
    editableEnabled = false,
    generateBuilderPackage = true,
    builderPackage = "io.fabirc8.ocm.builder",
    value = {"io.fabric8.ocm.model.accountsmgmt.v1"},
    excludes={"([^\\.]+[\\.]*)*Inline[a-zA-Z0-9_]*"})
public class Codegen {
}
