#Generic Blocking Queue

- Projede, generic bir queue veri yapısının implementasyonu, nesneye yönelik programlama prensipleri göz önünde bulundurularak gerçekleştirilmiştir.

- Oluşturulmuş olan queue veri yapısında array kullanılmamıştır. Bunun yerine linked list kullanımı tercih edilerek, queue yapısı dinamik olarak veri saklamaya uygun hale getirilmiştir.

- Queue yapısı üzerinde, node kullanılarak işlemler yapılmıştır. Node içerisinde iki adet değişken oluşturulmuştur. Bunlardan birisi veri için ayrılmıştır. Diğer değişken ise işaretçidir (pointer), bir sonraki düğümün adresini tutar.

- Kuyruğa bir eleman eklemek istendiğinde, ilk elemanın değeri kontrol edilir; null ise ilk eleman ve son elemana bir işaretçi konulur, sonuç null değilse eğer işaretçi kuyruktaki son elemanın bir sonraki node adresine geçer ve elemanı ekler.

- Kuyruk üzerinde belirli işlemler yapabilmek için add, peek ve poll metotları; oluşturulmuş olan Queue interface'i üzerinde tanımlanarak GenericBlockingQueue class'ı üzerinde implemente edilmiştir.

- Main metot üzerinde ise oluşturulmuş olan queue veri yapısı test edilmiştir. 

- Main metot içerisinde GenericBlockingQueue class'ından StringQueue ve IntegerQueue adında iki tane referans obje oluşturularak; add, peek ve poll metotlarının bu objeler aracılığıyla kullanımı sağlanmıştır.
