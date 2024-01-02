
SORULAR
(Önemli Not: Veri tipi ve isimlendirme seçimlerinde en uygun olanı tercih ediniz. Kendi uygulamam da örnek olarak İsim Soy isim için Nuri TIRAŞ, okul numarası için 571 değeri esas alınmış olup siz verilerinize göre bu değerleri değiştirmeniz gerekmektedir.)
1.	Android Studio programını çalıştırın. (1P)
2.	Projects  > New Project > Empty Views Activty > IsminizSoyisminizNumaraniz(NuriTiras571) adında diyanet.gov.tr kurumu için Java programlama dilini kullanarak  bir proje oluşturunuz. (4P)

3.	Mobil Geliştirme ortamında ConstraintLayout yerleşimini yandaki görünümü esas alarak alt alta yerleştiriniz.  (25P)
a)	“TDV Zekat Hesapla” Text View, renk:mavi(#0000FF), yazı boyutu:34sp, textAlignment:center, fontFamily:sans-serif-black
b)	 “Tasarım ve Kodlama : Isim Soyisim” Text View, renk:kirmizi(#FF0000), yazı boyutu:18sp, textAlignment:center, fontFamily:andika_new_basic
c)	Diğer tüm Text Viewlerin yazı boyutu:18sp olacak.
d)	İlk üç Edit Text nesnesi Number seçilecek, id değerleri sırasıyla numberTL, numberDolar, numberEuro olacak ve varsayılan text değerleri numaranız (571) olacak şekilde ayarlayınız. 
e)	“Kıymetli maden var mı?” yazısını içeren ve yazı boyutu:18sp olan Switch nesnesini ekleyiniz. 
f)	Son iki Edit Text nesnesi Number (Decimal) seçilecek, id değerleri sırasıyla numberAltin, numberGumus olacak ve varsayılan text değerleri (0.0) olacak şekilde ayarlayınız. 
g)	“HESAPLA” yazısını içeren, id değeri buttonHesapla olan button nesnesini ekleyiniz.
4.	“Kıymetli maden var mı?”  Evet seçilince altındaki ögeleri (iki adet Text View, iki adet Number (Decimal)) gösteren. Aksi takdirde gizleyen kodu yazınız. (10P)

5.	Kıymetli maden hariç, toplam mal varlığını geriye döndüren (altın gr olarak) ve üç parametresi olan (TL, Dolar, Euro) malVarligi isminde bir metod yazınız. (10P)

6.	Kıymetli maden dâhil, toplam mal varlığını geriye döndüren (altın gr olarak) ve beş parametresi olan (TL, Dolar, Euro, Altin, Gumus) Metot Aşırı Yükleme (Overloading) tekniğiyle bir metod daha yazınız. (15P)

7.	“HESAPLA” butonuna basıldığında eğer nisap (80.18 gr altın) miktarından az mal varlığı var ise Sonuç: Text View’ine “Size Zekât Düşmemektedir” mesajını yazınız.  Nisap miktarı ve üzeri mal varlığı var ise; verilecek Zekât miktarını Sonuç: Text View’ine TL cinsinden yazınız. (20P)

8.	Logcat ekranına 99 defa “Zekât vermek farzdır.” yazdıran programı Java dilinde kodlayınız. (for, while veya do-while döngülerinden herhangi birini kullanabilirsiniz.) (10P)

9.	Projeyi zip file olarak Export ederek (Öğrenci Belgeleri) Z:\Ortak\11B\MU\ dizinine yükleyin. (5P)

Önemli Bilgiler: Zekât, dinen zenginlik ölçüsü kabul edilen miktarda (nisap) mala sahip olan kimselerin Allah rızası için muayyen kişilere vermesi gereken belli miktarı ifade eder. Nisap, zekâtla yükümlü olmak için esas alınan zenginlik ölçüsüdür. Bu ölçü, altında 20 miskal (80.18 gr), devede 5, sığırda 30, koyun ve keçide 40 adettir. Buna göre temel ihtiyaçları dışında nisap miktarı mala sahip olan kişinin, yukarıda belirtilen diğer şartlar da yerine gelmişse bu mallarının zekâtını vermesi gerekir. (Kaynak: İslam Ansiklopedisi)
Biz uygulamamızda 80.18 gr. altını olanı esas alacağız. 1 gr. altın=1956.2TL, 1 gr. altın=66.3$, 1 gr. altın= 59.7€ ve 1 gr. altın=1836 gr. gümüş eder.  Tüm birimler altın cinsine çevrilip, toplam mal varlığı altın cinsinden hesaplanıp nisap miktarı öyle karşılaştırılacaktır. (Aşağıdaki formülü kullanabilirsiniz)
Kıymetli maden hariç toplam mal varlığı (altın gr. olarak) = (TL/1956.2+Dolar/66.3+Euro/59.7)
Kıymetli maden dahil toplam mal varlığı (altın gr.) = (TL/1956.2+Dolar/66.3+Euro/59.7+Altin+Gumus/1836)
Verilecek Zekât Miktarını TL olarak bulmak için; toplam mal varlığı TL’ye çevrilip öyle hesaplanacaktır. (Aşağıdaki formülü kullanabilirsiniz.)
Verilecek Zekât Miktarı (TL olarak) =Toplam Mal Varlığı (Altın gr. olarak) *1956.2/40

	Hasan DAĞ			Nuri TIRAŞ						Hüseyin CERİTLİ
		Bilişim Teknolojileri Öğretmenleri		 				    Okul Müdürü
