Morpheus test
=============

The idea is to attach `morpheus` Gradle task only when building tests and remove the `static` block only when testing.


If you execute the test you'll see `---This message should NOT appear` in the console and shouldn't. Note that `---Evil created` message won't appear because we're mocking it.

If you execute the app you won't see the message `---This message should NOT appear` in the console, although we'll see `---Evil created` message twice, which is what we want.