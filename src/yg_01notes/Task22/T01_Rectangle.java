    package yg_01notes.Task22;

    public class T01_Rectangle {
        private double width;
        private double length;

        public T01_Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return this.width;
        }

        public double getLength() {
            return this.length;
        }

        public double calculatePerimeter() {
            return 2 * (this.width + this.length);
        }

        public double calculateArea() {
            return this.width * this.length;
        }
        //Bu örnekte, genişlik ve uzunluk özel değişkenlerine sahip bir T01_Rectangle sınıfı tanımlıyoruz.
        // Daha sonra bu değişkenleri ayarlayan bir kurucu ve her değişken için alıcılar tanımlıyoruz.
        // Ayrıca, genişlik ve uzunluk değişkenlerini kullanarak dikdörtgenin çevresini ve alanını hesaplayan
        // calculatePerimeter() ve calculateArea() adlı iki yöntem tanımlıyoruz.
        // Son olarak, main() yönteminde, genişliği 5 ve uzunluğu 10 olan
        // yeni bir T01_Rectangle nesnesi oluşturuyoruz ve genişlik, uzunluk, çevre ve alan değerlerini yazdırıyoruz.


    }

