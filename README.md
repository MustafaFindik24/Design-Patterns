# Tasarım Kalıpları (Design Patterns) Nedir?

Yazılım geliştirme sürecinde karşılaşılan sorunları gidermek ve sürekli olarak tekrar edildiği gözlenen problemleri çözmek amacıyla kullanılan çözüm yöntemleri listesidir. 
![image](https://github.com/MustafaFindik24/Design-Patterns/assets/91599453/c62565ee-ad11-4fed-9b6f-38278c21a963)

Tasarım kalıpları, kodun nasıl bir bütün haline getirileceğini, yapılandırılmasını, geliştirme sürecinin ilgili kalıplara göre oluşturulmasını ve düzenlenmesini esas alır.
Genellikle 3 temel başlıktan oluşur.

Creational Patterns : Bu tür kalıplar nesnenin nasıl yaratıldığıyla ilgilenir. Kodun tekrar kullanılabilirliğini ve kodun esnekliğini amaçlar.
Structural Patterns : Oluşturulan nesnelerin nasıl birlikte kullanılacağı ve nesnelerin nasıl yapılandırılacağıyla ilgilenir. 
Behavioral Patterns : Nesneler arasındaki durumsal çeşitliliği, nesnelerin birbirleri arasında geçişkenliği ve iletişimi sağlayan şekilleri ele alır.

# 📌 Creational Patterns Nelerdir?

- Abstract Factory : Birden fazla nesne grubunu oluşturmayı amaçlayan ve farklı nesneler arasında kullanım sağlayan bir tasarım kalıbıdır. Interfaceler veya abstract sınıflar aracılığıyla nesne içerisinde alt nesneler yaratımı sağlanır. Bu sayede nesne özellikleri çeşitlendirilmiş olur.
- Builder : Nesne oluştururken nesnenin esnek bir yapıya sahip olması gerektiğinde kullanılabilir. Builder, nesnenin temel özelliklerini korurken aynı zamanda spesifik özelliklerin eklenmesine ve bu nesneyi sırasıyla inşaa etmeye olanak sağlar. Builder design patterni, tek bir nesne üzerine yoğunlaşır.
- Factory : Factory, en basit haliyle bir nesne yaratım patternidir. Nesne, tek bir sınıfta yaratılır ve if-else blokları ile sıralı olarak hangi nesnenin yaratılması gerektiğine karar verilir.
- Prototype : Prototype, projede birden fazla obje kullanımı gereken durumlarda kullanılır. Cloneable sınıfından kalıtılarak nesne yaratma maliyetini normal bir yaratmaya göre azaltır.
- Singleton : Nesnelerin yaratılması maliyetli kabul edildiği veya tek bir nesne üzerinden işlemlerin sağlanması gerektiği durumlarda singleton patterni kullanılabilir. 

# 📌 Structural Patterns Nelerdir?

- Adapter : Adapter, sınıflar arasında uyuşmazlığın olduğu ancak ilgili sınıfın kullanılması gerektiği durumlar için elverişlidir. Mevcut bir sınıfı adapte edilmesi istenilen arabirime uyacak şekilde ilgili sınıftan bir nesne oluşturulup kullanımı sağlanır. 
- Bridge : Bridge, farklı nesne yapılarını birbirlerinden ayrı tutarak bağımsız olarak değiştirilip geliştirilebilme imkanı sağlayan bir patterndir.
- Composite : Composite, ağaç benzeri hiyerarşik bir nesne yönetimi sağlayan patterndir. Nesneler birbirleri içerisinde birleşik bir yapı oluşturur.
- Decorator : Decorator, nesnenin hali hazırda olan yapısını koruyarak farklı özellikler kazandırılmasına olanak sağlar. Bu kalıpta benzer özelliklere sahip farklı nesnelerin oluşturulması ve o nesnelerin varolan özellikleri kazandırılması oldukça kolaydır.
- Facade : Facade, kodu istemci tarafından bağımsız hale getirerek alt sınıflarda yapılan değişikliklerin istemci tarafını etkilemesini önleyen, büyük ve kompleks sistemleri daha basit bir arayüze indirgemeyi amaçlayan bir patterndir.
- Flyweight : Flyweight, benzer özelliklere sahip olan nesnelerin tekrar oluşturulması yerine ilk yaratılan nesneyi kullanmayı sağlayan, bellek tüketimini azaltan bir patterndir.
- Proxy : Proxy, nesneye erişim maliyetini azaltan ve istemci tarafının direkt olarak veriye erişimini kontrol eden bir patterndir.

# 📌 Behavioral Patterns Nelerdir?

- Chain of Responsibility : Nesneler arasında iletim sağlayan, gelen isteği karşılayacak olan nesnenin istenilen bir durum içerisinde eklenmesi ve isteğin nesneler arasında işlenebilmesini sağlayan bir patterndir.
- Command : Command, işlemleri nesneler üzerinden yürütmeyi sağlayan, bu şekilde istemci tarafında farklı işlemleri gerçekleştirmeyi amaçlayan bir patterndir.
- Iterator : Iterator, Collection frameworkü içerisindeki veri yapılarını (List, Set, Map, etc.) bir Iterator arayüzü oluşturarak istenilen yapıyı kullanmamıza olanak sağlayan bir patterndir.
- Mediator : Mediator, nesneler arasındaki iletişimin karmaşık ve kompleks bir hale geldiği durumlarda aracı görevi görerek bağımlılığı azaltan ve nesnelerin yönetimini kolaylaştıran bir patterndir.
- Memento : Memento, önceki durumun kaydedilmesi gerektiği durumlarda işlem yapılmadan önce durumu bir objede tutup istenilen zamanda önceki duruma geri dönüş sağlayan bir patterndir. 
- Observer : Observer, pub-sub mantığına dayanan bir patterndir. Temelde iki bileşenden oluşan (Observer - Observable) nesneler kendi durumları aralarında haberleşebilirler. 
- State : State, bir nesnenin varolan durumunu değiştirmek veya birden fazla özellik arasında geçiş yapmak için kullanılan bir patterndir.
- Strategy : Strategy, birden fazla algoritmayı veya yöntemi birbirleri yerine kullanabilme özelliği sağlayan bir patterndir. Bir arayüz üzerinden algoritmaların kalıtımı sağlanıp yeni bir yöntem belirlenmesi oldukça esnek ve basittir.  
- Template : Template, farklı süreçlerde ortak kullanılan özellikleri temel olarak bir sınıfta toplayıp ayrıştırıcı özellikleri alt sınıflar yardımıyla tanımlamaya olanak sağlayan bir patterndir.
- Visitor : Visitor, varolan nesne yapısını değiştirmeden uygulamaya yeni modifikasyonlar kazandırmayı sağlayan bir patterndir.



















