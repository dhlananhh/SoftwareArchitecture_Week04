# Software Architecture Practice Exercises - Week 4

## Submission Information

- **Full Name**: Dương Hoàng Lan Anh
- **Student ID**: 21087481

---

## A> Design Patterns Application - Week 4:

### Exercise 1: Order Management System

**Giải thích về lựa chọn Design Pattern (State Pattern):**

- **Thay đổi hành vi dựa trên trạng thái:** Theo mô tả, hành vi của đơn hàng thay đổi tùy thuộc vào trạng thái hiện tại của nó (Mới tạo, Đang xử lý, Đã giao, Hủy). State Pattern cho phép một đối tượng thay đổi hành vi của nó khi trạng thái bên trong của nó thay đổi.
- **Đóng gói hành vi theo trạng thái:** Mỗi trạng thái (ví dụ: "Mới tạo") có các hành vi cụ thể liên quan đến nó (ví dụ: kiểm tra thông tin đơn hàng). State Pattern cho phép chúng ta đóng gói các hành vi này vào các lớp trạng thái riêng biệt. Điều này tuân theo nguyên tắc Single Responsibility Principle (SRP).
- **Dễ dàng thêm trạng thái mới:** Khi có thêm trạng thái đơn hàng (ví dụ: "Đang chờ thanh toán"), chúng ta chỉ cần tạo một lớp trạng thái mới mà không cần sửa đổi các lớp trạng thái hiện có hoặc lớp Order chính. Điều này tuân theo nguyên tắc Open/Closed Principle (OCP).
- **Chuyển đổi trạng thái rõ ràng:** State Pattern giúp việc chuyển đổi giữa các trạng thái trở nên rõ ràng và dễ quản lý hơn. Lớp Order (Context) có thể quản lý việc chuyển đổi trạng thái giữa các đối tượng trạng thái cụ thể.

**Sơ đồ UML:**
![Order Management System](proof_images/Exercise01_OrderManagementSystem_UML_Diagram.png)

**Kết quả:**
![Order Management System](proof_images/Exercise01_OrderManagementSystem.png)

**Kết luận:**
Sử dụng State Pattern giúp chúng ta xây dựng hệ thống quản lý đơn hàng một cách mềm dẻo, dễ bảo trì và mở rộng. Nó loại bỏ được sự phức tạp của việc dùng `if-else` lồng nhau để kiểm tra trạng thái, và thay vào đó tổ chức code một cách có cấu trúc và dễ hiểu.

### Exercise 2: Tax Calculation

**Giải thích về lựa chọn Design Pattern (Strategy & Decorator Patterns):**

- **Strategy Pattern (Thuế)**:
  • **Tính linh hoạt thuật toán**: Strategy Pattern giúp dễ dàng thêm các loại thuế mới (ví dụ: thuế nhập khẩu, thuế môi trường...) chỉ bằng cách tạo thêm các Concrete Strategy Classes.
  • **Mã nguồn gọn gàng**: Logic tính từng loại thuế được tách ra khỏi class `Product`, làm `Product` class trở nên đơn giản và chỉ tập trung vào việc quản lý dữ liệu sản phẩm.
- **Decorator Pattern (Tính năng bổ sung)**:
  • **Tính mở rộng động**: Decorator cho phép chúng ta _thêm động_ các tính năng bổ sung (giảm giá thuế, miễn thuế,...) cho việc tính thuế mà không cần sửa đổi code của các Strategy tính thuế gốc.
  • **Kết hợp linh hoạt**: Decorator có thể được kết hợp với nhau. Ví dụ: có thể có decorator "Giảm Thuế" kết hợp với decorator "Phí Xử Lý Thuế" (nếu bài toán phức tạp hơn).
  • **Nguyên tắc Open/Closed Principle**: Decorator Pattern tuân theo nguyên tắc Open/Closed Principle: mở rộng nhưng không sửa đổi code cũ.

**Kết quả:**
![Tax Calculation](proof_images/Exercise02_TaxCalculation.png)

**Kết luận:**

Kết hợp Strategy Pattern và Decorator Pattern là một giải pháp mạnh mẽ và linh hoạt cho bài toán tính thuế. Strategy Pattern giúp quản lý các thuật toán tính thuế đa dạng, trong khi Decorator Pattern cho phép thêm các tính năng bổ sung một cách dễ dàng và tuân theo các nguyên tắc thiết kế hướng đối tượng tốt.

### Exercise 3: Payment System

**Giải thích về lựa chọn Design Pattern (Strategy & Decorator Patterns):**

- **Strategy Pattern (Phương thức thanh toán)**:
  - **Dễ dàng thêm phương thức mới**: Strategy Pattern giúp thêm các phương thức thanh toán mới (ví dụ: ví điện tử MoMo, VNPay,...) một cách đơn giản, bằng cách tạo thêm các Concrete Strategy Classes mới implement `PaymentStrategy`.
  - **Linh hoạt lựa chọn runtime**: Client code có thể linh hoạt chọn phương thức thanh toán mong muốn tại thời điểm chạy chương trình.
- **Decorator Pattern (Tính năng bổ sung)**:
  - **Tính năng đa dạng và linh hoạt**: Decorator cho phép thêm các tính năng như phí xử lý, giảm giá, tích điểm, v.v. một cách linh hoạt.
  - **Tránh phình to class Strategy gốc**: Nếu chúng ta thêm các tính năng này trực tiếp vào `PaypalPaymentStrategy` hoặc `CreditCardPaymentStrategy`, code của các class này sẽ trở nên phình to và phức tạp. Decorator giúp tách các tính năng này ra các class decorator riêng, code module hóa và dễ quản lý hơn.
  - **Kết hợp decorator**: Chúng ta có thể dễ dàng kết hợp nhiều decorators với nhau. Ví dụ, vừa áp dụng mã giảm giá, vừa tính phí xử lý cho cùng một giao dịch thanh toán.

**Kết quả:**
![Payment System](proof_images/Exercise03_PaymentSystem.png)

**Kết luận:**

Tương tự như bài toán thuế, Strategy và Decorator Pattern kết hợp với nhau tạo nên một hệ thống thanh toán rất mạnh mẽ. Strategy quản lý các phương thức thanh toán cốt lõi, còn Decorator đảm bảo khả năng mở rộng và tùy biến tính năng thanh toán theo nhu cầu thực tế, tuân thủ các nguyên tắc thiết kế tốt.

---

<details>
<summary>
    <h2>B> Java Design Patterns Code Implementation</h2>
</summary>

### I) Creational Design Patterns:

#### 1. Singleton Pattern:

Reflection Singleton Test:
![Reflection Singleton Test](proof_images/ReflectionSingletonTest.png)

Serialization Singleton Test:
![Serialization Singleton Test](proof_images/SingletonSerializedTest.png)

#### 2. Factory Pattern:

![Test Factory Pattern](proof_images/TestFactoryPattern.png)

#### 3. Abstract Factory Pattern:

Test Abstract Factory Pattern:
![Test Abstract Factory Pattern](proof_images/TestAbstractFactoryPattern.png)

#### 4. Builder Pattern:

Test Builder Pattern:
![Test Builder Pattern](proof_images/TestBuilderPattern.png)

#### 5. Prototype Pattern:

Test Prototype Pattern:
![Test Prototype Pattern](proof_images/TestPrototypePattern.png)

---

### II) Structural Design Patterns:

#### 1. Adapter Pattern:

Test Adapter Pattern:
![Test Adapter Pattern](proof_images/TestAdapterPattern.png)

#### 2. Composite Pattern:

Test Composite Pattern:
![Test Composite Pattern](proof_images/TestCompositePattern.png)

#### 3. Proxy Pattern:

Test Proxy Pattern:
![Test Proxy Pattern](proof_images/TestProxyPattern.png)

#### 4. Flyweight Pattern:

Test Flyweight Pattern:
![Test Flyweight Pattern](proof_images/TestFlyweightPattern.png)

#### 5. Facade Pattern:

Test Facade Pattern:
![Test Facade Pattern](proof_images/TestFacadePattern.png)

As a result, the pdf and html files were successfully exported from MySQL database:
![Exported PDF file](proof_images/TestFacadePattern_PDF.png)
![Exported HTML file](proof_images/TestFacadePattern_HTML.png)

#### 6. Bridge Pattern:

Test Bridge Pattern:
![Test Bridge Pattern](proof_images/TestBridgePattern.png)

#### 7. Decorator Pattern:

Test Decorator Pattern:
![Test Decorator Pattern](proof_images/TestDecoratorPattern.png)

---

### III) Behavioral Design Patterns:

</details>
