package by.epam.student.dobrov.mod3.StringArr1;

/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class String1 {
    public static void main(String[] args) {
        String[] camelCase = new String[]{"idNum", "stringLine", "charVar", "stringVar", "number", " "};
        String[] snakeCase = Solution.snakeCase(camelCase);

        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }
}
