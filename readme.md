#### Test custom meta-annotation used in libraries

First 2 modules are unloaded - they can be used to build the library jars, but should not be added to the use-libraries module as modules.
The library jars (with sources) are located in the ``lib`` folder of this module and are added as jar libraries.

Actual issue:
[Spring: library beans defined using the custom @Bean-based annotations are shown as not available for autowiring](https://youtrack.jetbrains.com/issue/IDEA-265629)


See the com.mytests.spring.useLibrariesTest.components.Compo1