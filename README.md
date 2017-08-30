# License Builder
* **Purpose**
	* to demonstrate [Builder Design Pattern](http://www.javaworld.com/article/2074938/core-java/too-many-parameters-in-java-methods-part-3-builder-pattern.html)
* **Design Description** - Separate the consutrction of a complex object from its representation so that the same construction process can create different representations.
	* Description Source - _Design Patterns: Gang of Four_

* **Objective**
	* to implement a `LicenseCreatorController` which uses a `LicenseCreator` and a [composite](https://en.wikipedia.org/wiki/Composition_over_inheritance) `LicenseBuilder` to generate `License` objects
	* to implement a `LicenseController` which is a _data store_ for `License` objects.
	* to implement a `PersonCreatorController` which uses a `PersonCreator` and a [composite](https://en.wikipedia.org/wiki/Composition_over_inheritance) `PersonBuilder` to generate `Person` objects
	* to implement a `PersonController` which is a _data store_ for `Person` objects.

# Domain Implementation

* _Domain objects_ are the backbone for an application and contain the [business logic](https://en.wikipedia.org/wiki/Business_logic).
* Create a sub package of `io.zipcoder.tc_spring_licensebuilder_application` named `domain`


## Part 1.0 - Create class `License`
* Create a class `License` in the `domain.anthropoid.license` sub-package.
* `License` class signature is annotated with `@Entity`
	* `@Entity`
		* denotes a single row in the database
* `License` has an `id` instance variable of type `Long`
	* `id` should be `annotated` with
		* `@Id`
			* denotes primary key of this entity
		* `@GeneratedValue`
			* configures the way of increment of the specified `column(field)`
		* `@Column(name = "LICENSE_ID")`
			* specifies mapped column for a persistent property or field
* Each of the fields below should be annotated with `@Column(name = "CLASSNAME_FIELDNAME")` respectively.
	* `License` has a `firstName` instance variable of type `String`
	* `License` has a `lastName` instance variable of type `String`
	* `License` has a `middleName` instance variable of type `String`
	* `License` has a `streetAddress` instance variable of type `String`
	* `License` has a `city` instance variable of type `String`
	* `License` has a `state` instance variable of type `State`
	* `License` has a `isFemale` instance variable of type `boolean`
	* `License` has a `birthDate` instance variable of type `Date`
	* `License` has a `expirationDate` instance variable of type `Date`
	* `License` has a `issueDate` instance variable of type `Date`
	* `License` has a `licenseClass` instance variable of type `Character`
	* `License` has a `licenseClass` instance variable of type `String`
* `License` should have a non-default constructor which takes an argument of each of the field-types and sets them respectively.
* Feel free to add any additional fields and continue with this lab accordingly.

## Part 1.1 - Create class `LicenseBuilder`
* Create a class `LicenseBuilder` in the `domain.anthropoid.license` sub-package
* `LicenseBuilder` should have identical instance variables to `License` class.
* `LicenseBuilder` should have an empty _nullary constructor_.
* `LicenseBuilder` should have a setter for each instance variable.
	* Setters in a _builder class_ set instance variables, then return the instance of the _builder class_. This enables elegant chaining of method calls.
* `LicenseBuilder` should have a `build` method which returns a new instance of a `License` whose values have been set to each of the respective instance variables in the `LicenseBuilder` class.


## Part 1.2 - Create class `LicenseCreator`
* Create a class `LicenseCreator` in the `domain.anthropoid.license` sub-package
* `LicenseCreator` should define a `createMockLicense` method which returns a `License` object created by the `build` method of a `LicenseBuilder`.
	* **Note:** Typically, it is bad practice to create methods which have aspects of randomness, as it creates unpredictability when testing for specific outcomes. However, here the values of each field are unimportant. Rather, the focus is on the object relationship and orchestration.






## Part 1.3 - Create class `LicenseCreatorTest`
* Create a class `LicenseCreatorTest` in a `src.test.java.io.zipcoder.zcw_licensebuilder.anthropoid.license` sub-package.
* `LicenseCreatorTest` should have a method `testCreateMockLicense` which asserts each field of the `License` object generated by `createMockLicense` is a non-`null` value.






## Part 2.0 - Create class `Person`
* Create a class `Person ` in the `domain.anthropoid` sub-package.
* `Person` class signature is annotated with `@Entity`
	* `@Entity`
		* denotes a single row in the database
* `Person` has an `id` instance variable of type `Long`
	* `id` should be `annotated` with
		* `@Id`
		* `@GeneratedValue`
		* `@Column(name = "PERSON_ID")`
			* specifies mapped column for a persistent property or field
* Each of the fields below should be annotated with `@Column(name = "CLASSNAME_FIELDNAME")` respectively.
	* `Person` has a `firstName` instance variable of type `String`
	* `Person` has a `lastName` instance variable of type `String`
	* `Person` has a `middleName` instance variable of type `String`
	* `Person` has a `streetAddress` instance variable of type `String`
	* `Person` has a `city` instance variable of type `String`
	* `Person` has a `state` instance variable of type `State`
	* `Person` has a `isFemale` instance variable of type `boolean`
	* `Person` has a `birthDate` instance variable of type `Date`

## Part 2.1 - Modify class `LicenseBuilder`
* Add a constructor to `LicenseBuilder` which takes an argument of a `Person` object and sets the value of each of the `LicenseBuilder` fields to the respective `Person` object field values.

## Part 2.2 - Modify class `LicenseCreator`
* Create a method named `createPersonLicense` which has a parameter of `Person` and returns a `License` object whose instance variables mirror the respective argument.
* Create a method named `createPartiallyMockedLicense` which has a parameter of `Person` and returns a `License` object whose instance variables mirror the respective argument and the remaining `null` variables are assigned to random values.


## Part 2.3 - Create class `LicenseBuilderTest`
* Create class `LicenseBuilderTest` in the `src.test.java.io.zipcoder.zcw_licensebuilder.anthropoid` sub-package.
* Create a method named `testNullaryConstructor` which ensures a `LicenseBuilder` constructed by its _nullary constructor_ creates a `License` with `null` fields upon invoking the `build` method.
* Create a method named `testCreatePersonLicense` which ensures a `LicenseBuilder` constructed by its _non-nullary-constructor_ creates a `License` with fields whose values mirror the respective `Person` object.
	* **Note:** Be sure to assert that fields proprietary to the `License` object are `null` in the newly constructed `License`. That is: Be sure that the only fields set by the `LicenseBuilder` are those fields which are contained in the respective `Person` object.


## Part 2.4 - Modify class `LicenseCreatorTest`
* Create a method named `testCreatePersonLicense` which ensures the `LicenseFactory` creates a `License` with fields whose values mirror the respective `Person` object.
	* **Note:** Be sure to assert that fields proprietary to the `License` object are `null` in the newly constructed `License`. That is: Be sure that the only fields set by the `LicenseBuilder` are those fields which are contained in the respective `Person` object.


## Part 3.0 - Create class `PersonBuilder`
* Create a class `PersonBuilder` in the `zcw_licensebuilder.anthropoid` sub-package.
	* **Note:** `PersonBuilder` behaves as a `Builder` class for `Person` objects.


## Part 3.1 - Create class `PersonCreator`
* Create a class `PersonCreator` in the `zcw_licensebuilder.anthropoid` sub-package.
* Create a method `createMockPerson` which makes use of a `PersonBuilder` object to build a `Person` object whose instance variables have been assigned to random values.
* Create a method `createProjectAuthor` which makes use of a `PersonBuilder` object to build a `Person` object whose instance variables have been assigned to the respective project author's personal-details.
* Create a method `createLicensedPerson` which takes an argument of a `License` and generates a respective `Person` object.

## Part 3.2 - Create class `PersonCreatorTest`
* Create a class `PersonCreatorTest` in the `src.test.java.io.zipcoder.zcw_licensebuilder.anthropoid`
	* **Note:** Mirror the instructions from `Part 1.3` and `Part 2.4`.

## Part 3.3 - Modify class `LicenseCreator`
* Refactor `createMockedLicense` so that its body defintion is a single line.
	* **Note:** Try integrating `createPartiallyMockedLicense` and `createMockPerson`.
* Ensure that `LicenseCreatorTest` still has 100% pass rate.

# Part 4 - Abstract the Creator classes
* Using the [abstract factory pattern lab](https://github.com/Zipcoder/TC-Spring-VehicleFactory-Application) as an example, abstract each of the creator classes.
