# İş parçacığı, 
## Güvenliği nedir ?

```
Java, aynı anda birden çok iş parçacığı çalıştırma işlemi olan Multithreading özelliğine sahiptir. Aynı veri üzerinde birden fazla iş parçacığı çalıştığında ve verilerimizin değeri değiştiğinde, bu senaryo iş parçacığı için güvenli değildir ve tutarsız sonuçlar alırız. Bir iş parçacığı zaten bir nesne üzerinde çalışıyorsa ve başka bir iş parçacığının aynı nesne üzerinde çalışmasını engelliyorsa, bu işleme İş parçacığı Güvenliği (Thread safety) denir.
```
## Hangi durumlarda kullanılır ?

```
Gelişmiş programlama dillerinden olan Java, yapısı itibari ile iş parçacığını destekler. Bu, bytecode'u ayrı çalışan iş parçacıklarında aynı anda çalıştırarak, JVM'nin uygulama performansını iyileştirebileceği anlamına gelir. Çoklu iş parçacığı güçlü bir özellik olsa da, bir bedeli vardır. Çok iş parçacıklı ortamlarda, uygulamaları iş parçacığı güvenli bir şekilde yazmamız gerekir. Bu, farklı iş parçacıklarının, hatalı davranış göstermeden veya öngörülemeyen sonuçlar üretmeden aynı kaynaklara erişebileceği anlamına gelir.
```
## Neden kullanılır? avantaj ve dezavantajları nelerdir ?

```
İş parçacıkları var olan işlerin yükünü azaltmak adına kullanılan iş paylaşım yöntemidir. büyük bir işi bölerek, azaltıp daha hızlı bir işlem yapılabilir (böl ve fethet mantığı gibi) ama yeterli kaynak olmaması ve karşıyalamaması durumlarında ciddi sıkıntılar yaşanabilir.
```
**Kaynak :**
**[Thread safety](https://docs.oracle.com/cd/E19683-01/806-6867/6jfpgdco5/index.html#:~:text=Thread%20safety%20is%20the%20avoidance,private%20copy%20of%20the%20data.)**

**MultiThreading Methods / (çoklu iş parçacığı yöntemleri)**
* Stateless Implementations
* Immutable Implementations
* Thread-Local Fields
* Synchronized Collections
* Concurrent Collections
* Atomic Objects
* Synchronized Methods
* Synchronized Statements
* Other Objects as a Lock
* Caveats
* Volatile Fields
* Reentrant Locks
* Read/Write Locks
* Conclusion