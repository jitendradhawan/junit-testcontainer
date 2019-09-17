package com.phonepe.testcontainer.commons;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class InstallPackageProperties {

    boolean enabled = true;
    Set<String> packages = new HashSet<>();
}
