class Stack<T> {
    private val items = mutableListOf<T>()

    fun push(item: T) {
        items.add(item)
    }

    fun pop(): T? {
        return if (items.isEmpty()) null else items.removeLast()
    }

    fun size() = items.size

    fun isEmpty() = items.isEmpty()
}