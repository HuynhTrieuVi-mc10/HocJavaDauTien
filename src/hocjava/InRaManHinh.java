package hocjava;

public class InRaManHinh {
    // Lệnh tạo khối lệnh chạy chương trình đơn giản: psvm -> Enter
    static void main() {
        // Lệnh in ra màn hình: sout -> Enter
        System.out.println("Lệnh in ra màn hình");

        // Xuất dữ liệu (in ra màn hình)
        // Xuất xuống dòng: System.out.println() (viết tắt là sout)
        System.out.println("dòng 1");
        System.out.println("dòng 2"); // Ctrl + D để copy xuống dòng nhanh
        System.out.println("dòng 3");
        // Xuất không xuống dòng: System.out.print() (cũng viết tắt là sout nhưng bỏ "ln" sau khi Enter)
        System.out.print("dòng 4");
        System.out.print("dòng 5");
        System.out.print("dòng 6");
        System.out.println("dòng 7");
    // Chú ý:
    // Lệnh println sau khi in ra màn hình thì con trỏ sẽ enter xuống dòng
    // Lệnh print sau khi in ra màn hình thì con trỏ nằm ngay phía sau của dòng phía trước
        // Xuất ký tự kiểu đặc biệt
        // \t là in dòng thụt vào 1 tab (4 dấu cách)
        System.out.println("Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam");
        System.out.println("\tĐộc lập - Tự do - Hạnh phúc");
        // \n là in xuống dòng trong một dãy ký tự nằm trong cùng ngoặc kép ""
        System.out.println("Đồng Đằng có phố Kỳ Lừa\nCó nàng Tô Thị, có chùa Tam Thanh");
        // \" là thêm dấu ngoặc kép vào một đoạn ký tự
        System.out.println("Người xưa từng nói \"Có công mài sắt có ngày nên kim\"");
    }
}
