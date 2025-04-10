package CollectionManagement;
/**
 * Генератор уникальных ID для объектов Route.
 * Гарантирует, что каждый новый ID будет больше 0 и уникален.
 */
public class IdGenerator {
    private int lastId = 0;

    /**
     * Возвращает следующий уникальный ID.
     * @return Новый ID (гарантированно > 0)
     */
    public synchronized int generateNextId() {
        lastId++;
        return lastId;
    }

    /**
     * Сбрасывает генератор (для тестов или перезагрузки данных).
     */
    public synchronized void reset() {
        lastId = 0;
    }
}