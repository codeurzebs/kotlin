import kotlin.reflect.jvm.*

abstract class Itr : Iterator<String>
abstract class MItr : MutableIterator<String>
abstract class LItr : ListIterator<String>
abstract class MLItr : MutableListIterator<String>
abstract class It : Iterable<String>
abstract class MIt : MutableIterable<String>
abstract class C : Collection<String>
abstract class MC : MutableCollection<String>
abstract class L : List<String>
abstract class ML : MutableList<String>
abstract class S : Set<String>
abstract class MS : MutableSet<String>
abstract class M : Map<String, String>
abstract class MM : MutableMap<String, String>
abstract class ME : Map.Entry<String, String>
abstract class MME : MutableMap.MutableEntry<String, String>

abstract class L2 : L()
abstract class ML2 : ML()

abstract class Weird : Iterator<String>, MutableList<String>

fun expectInterfaces(jClass: Class<*>, expectedInterfaceNames: Set<String>) {
    val actualInterfaceNames = jClass.getInterfaces().mapTo(linkedSetOf<String>()) { it.name }

    assert(actualInterfaceNames == expectedInterfaceNames) {
        "${jClass.name}: interfaces: expected: $expectedInterfaceNames; actual: $actualInterfaceNames"
    }
}

fun box(): String {
    expectInterfaces(Itr::class.java, setOf("java.util.Iterator", "kotlin.jvm.internal.KMappedMarker"))
    expectInterfaces(MItr::class.java, setOf("java.util.Iterator", "kotlin.jvm.internal.KMutableIterator"))
    expectInterfaces(LItr::class.java, setOf("java.util.ListIterator", "kotlin.jvm.internal.KMappedMarker"))
    expectInterfaces(MLItr::class.java, setOf("java.util.ListIterator", "kotlin.jvm.internal.KMutableListIterator"))
    expectInterfaces(It::class.java, setOf("java.lang.Iterable", "kotlin.jvm.internal.KMappedMarker"))
    expectInterfaces(MIt::class.java, setOf("java.lang.Iterable", "kotlin.jvm.internal.KMutableIterable"))
    expectInterfaces(C::class.java, setOf("java.util.Collection", "kotlin.jvm.internal.KMappedMarker"))
    expectInterfaces(MC::class.java, setOf("java.util.Collection", "kotlin.jvm.internal.KMutableCollection"))
    expectInterfaces(L::class.java, setOf("java.util.List", "kotlin.jvm.internal.KMappedMarker"))
    expectInterfaces(ML::class.java, setOf("java.util.List", "kotlin.jvm.internal.KMutableList"))
    expectInterfaces(S::class.java, setOf("java.util.Set", "kotlin.jvm.internal.KMappedMarker"))
    expectInterfaces(MS::class.java, setOf("java.util.Set", "kotlin.jvm.internal.KMutableSet"))
    expectInterfaces(M::class.java, setOf("java.util.Map", "kotlin.jvm.internal.KMappedMarker"))
    expectInterfaces(MM::class.java, setOf("java.util.Map", "kotlin.jvm.internal.KMutableMap"))
    expectInterfaces(ME::class.java, setOf("java.util.Map\$Entry", "kotlin.jvm.internal.KMappedMarker"))
    expectInterfaces(MME::class.java, setOf("java.util.Map\$Entry", "kotlin.jvm.internal.KMutableMap\$Entry"))
    expectInterfaces(L2::class.java, setOf<String>())
    expectInterfaces(ML2::class.java, setOf<String>())
    expectInterfaces(Weird::class.java,
                     setOf("java.util.Iterator", "kotlin.jvm.internal.KMappedMarker",
                           "java.util.List", "kotlin.jvm.internal.KMutableList"))

    return "OK"
}