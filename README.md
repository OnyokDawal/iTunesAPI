# android-task-itunes-sample
an iTunes api for android show movie content within Australia

# UI and Design
Master and Detail Layout.

It has 2 screen activity:

1. MainActivity it holds all the list of movie shows from iTunes API.
2. DetailActivity show the details of the data binds in recyclerView from iTunes API.

I use GLide for image url loading.

# Architecture: MVVM
Recommended coding architecture by Google jetpack components.

It is also easy to learn especially for beginners and alot easier to construct and follow principles.

1 Model - Holds the data of the application. It cannot directly talk to the View.

2. View - represents the UI and responsible to listen state changes from ViewModel.
3. ViewModel - A link between a View and Model.

# Persistence
I used Android ROOM library to have easier interface in sqlite for local storage.
(unfinished task)

# API
iTunes api was used.
I used Retrofit to consumed the api and mapped data using GSON.

Created a service with 1 function.

1. getiTunesApiList() - which accept a map of key-values pairs.
