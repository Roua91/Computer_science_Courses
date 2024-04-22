# test_jar.py
import pytest
from jar import Jar

def test_deposit():
    jar = Jar()
    jar.deposit(1)
    assert jar.cokies == 1

def test_withdraw():
    jar = Jar()
    jar.deposit(4)

    # Test valid withdrawal
    jar.withdraw(2)
    assert jar.cokies == 2

    # Test invalid withdrawal (more than available)
    with pytest.raises(ValueError):
        jar.withdraw(5)

def test_capacity_property():
    jar = Jar()
    jar.capacity = 15
    assert jar.capacity == 15

    # Test invalid capacity
    with pytest.raises(ValueError):
        jar.capacity = -5

def test_size_property():
    jar = Jar()
    jar.size = 10
    assert jar.size == 10

    # Test invalid size (exceeds capacity)
    with pytest.raises(ValueError):
        jar.size = 20

if __name__ == "__main__":
    pytest.main()
