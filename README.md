# Quick Links


[IncomeAPI class](./app/src/main/java/com/uxstate/networkincometest/data/remote/api/IncomeAPI.kt) - Defines the Retrofit @GET API request with a single function

[DTO classes](./app/src/main/java/com/uxstate/networkincometest/data/remote/dto) - This package Stores the converted Kotlin Objects from the JSON String

[Repository Implementation class](./app/src/main/java/com/uxstate/networkincometest/data/remote/repository/IncomeRepositoryImpl.kt) - Repository Code with Single Source of Truth, simply makes the api request and catches errors if any

[App Module ](./app/src/main/java/com/uxstate/networkincometest/di/AppModule.kt) - Dependency injection module to create Retrofit, client, logging and use cases

[ViewModel Class](./app/src/main/java/com/uxstate/networkincometest/presentation/screens/home_screen/HomeViewModel.kt) - This class holds the state

[Model Class](./app/src/main/java/com/uxstate/networkincometest/domain/model/ReceiptItem.kt) - Has the relevant data fields, uses BigDecimal as well as LocalDateTime

[Mapper Functions](./app/src/main/java/com/uxstate/networkincometest/data/remote/mappers/Mappers.kt) - Converts the very bulky Data Transfer Objects (DTOs) to model classes which has the data that we will display to the user

[DateUtilFunctions](./app/src/main/java/com/uxstate/networkincometest/util/DateUtilFunctions.kt) - Converts date JSON String to LocalDateTime and then back to formatted Human Readable Dates

[String Value XML](./app/src/main/res/values/strings.xml) - Nothing fancy here, just XML string resources with placeholders to easitly format BigDecimal, specify currency/dollar symbol and put those 2 decimal places

[ReceiptItemComposable](./app/src/main/java/com/uxstate/networkincometest/presentation/screens/home_screen/components/ReceiptItemComposable.kt) - Quick Composable file to reader the data points, nothing to worry about if you are not familiar with Compose, XML will do the same stuff



# Screenshots

These are the results when I ran the app on my Emulator.

<p align="center">
<img img width="300" height="600" src="./screenshots/sample_1.png"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img img width="300" height="600" src="./screenshots/sample_2.png">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

</p>

Do Reach Out :

  [Twitter](https://twitter.com/Tonnie_Dev)

Cheers!!

