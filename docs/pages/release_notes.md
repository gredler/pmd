---
title: PMD Release Notes
permalink: pmd_release_notes.html
keywords: changelog, release notes
---

## {{ site.pmd.date }} - {{ site.pmd.version }}

The PMD team is pleased to announce PMD {{ site.pmd.version }}.

This is a {{ site.pmd.release_type }} release.

{% tocmaker is_release_notes_processor %}

### New and noteworthy

#### New rules

*   The new Java rule {% rule "java/codestyle/FinalParameterInAbstractMethod" %} detects parameters that are
    declared as final in interfaces or abstract methods. Declaring the parameters as final is useless
    because the implementation may choose to not respect it.

```xml
    <rule ref="category/java/codestyle.xml/FinalParameterInAbstractMethod" />
```

   The rule is part of the quickstart.xml ruleset.

#### Modified rules

*   The Apex rule {% rule "apex/documentation/ApexDoc" %} has a new property `reportProperty`.
    If set to `false` (default is `true` if unspecified) doesn't report missing ApexDoc comments on properties.
    It allows you to enforce ApexDoc comments for classes and methods without requiring them for properties.

### Fixed Issues

*   java
    *   [#3698](https://github.com/pmd/pmd/issues/3698): \[java] Error resolving Symbol Table
*   java-bestpractices
    *   [#3209](https://github.com/pmd/pmd/issues/3209): \[java] UnusedPrivateMethod false positive with static method and cast expression
    *   [#3468](https://github.com/pmd/pmd/issues/3468): \[java] UnusedPrivateMethod false positive when outer class calls private static method on inner class
*   java-design
    *   [#3679](https://github.com/pmd/pmd/issues/3679): \[java] Make FinalFieldCouldBeStatic detect constant variable
*   java-errorprone
    *   [#3686](https://github.com/pmd/pmd/issues/3686): \[java] ReturnEmptyCollectionRatherThanNull - false negative with conditioned returns
    *   [#3701](https://github.com/pmd/pmd/issues/3701): \[java] MissingStaticMethodInNonInstantiatableClass false positive with method inner classes
*   java-performance
    *   [#3492](https://github.com/pmd/pmd/issues/3492): \[java] UselessStringValueOf: False positive when there is no initial String to append to

### API Changes

### External Contributions

*   [#3631](https://github.com/pmd/pmd/pull/3631): \[java] Fixed False positive for UselessStringValueOf when there is no initial String to append to - [John Armgardt](https://github.com/johnra2)
*   [#3683](https://github.com/pmd/pmd/pull/3683): \[java] Fixed 3468 UnusedPrivateMethod false positive when outer class calls private static method on inner class - [John Armgardt](https://github.com/johnra2)
*   [#3688](https://github.com/pmd/pmd/pull/3688): \[java] Bump log4j to 2.16.0 - [Sergey Nuyanzin](https://github.com/snuyanzin)
*   [#3693](https://github.com/pmd/pmd/pull/3693): \[apex] ApexDoc: Add reportProperty property - [Steve Babula](https://github.com/babula)
*   [#3704](https://github.com/pmd/pmd/pull/3704): \[java] Fix for #3686 - Fix ReturnEmptyCollectionRatherThanNull - [Oleksii Dykov](https://github.com/dykov)
*   [#3713](https://github.com/pmd/pmd/pull/3713): \[java] Enhance UnnecessaryModifier to support records - [Vincent Galloy](https://github.com/vgalloy)
*   [#3719](https://github.com/pmd/pmd/pull/3719): \[java] Upgrade log4j to 2.17.1 - [Daniel Paul Searles](https://github.com/squaresurf)
*   [#3720](https://github.com/pmd/pmd/pull/3720): \[java] New rule: FinalParameterInAbstractMethod - [Vincent Galloy](https://github.com/vgalloy)
*   [#3724](https://github.com/pmd/pmd/pull/3724): \[java] Fix for #3686 - fix FinalFieldCouldBeStatic - [Oleksii Dykov](https://github.com/dykov)
*   [#3742](https://github.com/pmd/pmd/pull/3742): \[java] Fix #3701 - fix MissingStaticMethodInNonInstantiatableClass for method local classes - [Oleksii Dykov](https://github.com/dykov)
*   [#3744](https://github.com/pmd/pmd/pull/3744): \[core] Updated SaxonXPathRuleQueryTest.java - [Vyom Yadav](https://github.com/Vyom-Yadav)

{% endtocmaker %}

