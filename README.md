# Kyptonite

This Android App fetches the Exchange Rates between different currencies using https://currencylayer.com/documentation.

### Key features

* User can select the desired currency for which the exchange rates are required.
* User can enter the amount that need to be converted to a different currency.
* The available/supported currencies are only fetched from the remote server first time the app is opened and persisted locally.
* The exchange rates between currencies are refreshed after atleast 30 mins and persisted locally.
* The App uses MVVM architectural design pattern. The architectural layers are shown below:

Activities \| Fragments |
:---: |
ViewModel |
UseCases |
Repository |
AppDatabase \| CurrencyApi |

* Few unit tests to ensure correct functioning of the Repository.
* A currency not supported/available by the API like **SSD**, are supported by local conversion.
  * Instead of storing it's exchange rate for every currency, it's exchange rate with **USD** is kept and the rest of the exchange rates are calculated recursively.

### Silver linings

* Supports landscape screen orientation.
* Supports multi-window.
* Multi-item recycler view adapter, which uses custom written annotation processor to generate viewholders.

### How to run

* Clone the repository.
* Import the project in Android Studio. (May require *Android Studio 4.0 - Preview* as the project was built using that)
* Add `currency_layer_access_key=` in local.properties file.
* Run the App.

### Screenshots

