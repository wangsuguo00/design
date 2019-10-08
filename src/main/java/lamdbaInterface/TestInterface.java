package lamdbaInterface;

/**
 * @auth:wsg
 * @function:函数式接口：
 *                      1）:必须有一个抽象方法(有企且只有一个抽象方法)
 */
@FunctionalInterface
public interface TestInterface {

    public String test(String value);

    default String method(String value) {
        return "123";
    };
}
