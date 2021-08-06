## Spring boot ile Çoklu-İş parçacığı(Multi-threading)

>İş parçacıkları bağımsızdır çünkü hepsinin ayrı yürütme yolu vardır, bu nedenle bir iş parçacığında bir istisna oluşursa, diğer iş parçacıklarının yürütülmesini etkilemez. Bir işlemin tüm iş parçacıkları ortak belleği paylaşır. Aynı anda birden çok iş parçacığı yürütme işlemi, çoklu iş parçacığı olarak bilinir. Hiç şüphe yok ki, çoklu iş parçacığı java'da çok önemli bir özelliktir, ancak aynı zamanda biraz daha karmaşıktır.

*[asenkron yapılar için olan thread uygulaması örneği adımları]*

Öncelikle spring boot template ini oluşturduktan sonra kendi lokal bilgisayarımıza indirip import ederiz
Daha sonrasında Zaman uyumsuz görevlerimizi yazmanın zamanı geldi, ancak önce @EnableAsync ek açıklamasını kullanarak zaman uyumsuz özelliğini etkinleştirdiğini spring'e belirtmeliyiz.

```java
@SpringBootApplication
@EnableAsync
public class DemoThreadProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoThreadProjectApplication.class, args);
	}

}
```
Bu belirtilen asenkron thread yapısı için demo görev sınıfı yazalım,

```java
@Component
public class AsyncTaskDemo {

	@Async
	public void someAsyncMethod() {
		try {
			Thread.sleep(3000);	// Let me sleep for 3 sec
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("My Name " + Thread.currentThread().getName());
	}
}
```
oluşturduktan sonra bu yapımızı gerekli anotasyonları ekledikten sonra demoControllerda kullanalım,

```java
@RestController
public class DemoController {

	@Autowired
	private AsyncTaskDemo asyncDemo;

	@RequestMapping("/getThread")
	public Map<String, String> callAsyncMethod() {

		asyncDemo.someAsyncMethod();
		
		return new HashMap<String, String>();  // returns empty braces
	}
}
```
tarayıcımızda endpointe localhost://.. /getThread yazdıktan sonra ne odlgunu anlatmış oldugum thread yapısını springboot kullanarak uygulamış olduk.
>Pogram çıktısı :
```
My name task-1
My name task-2
My name task-3
My name task-4
My name task-5
```
