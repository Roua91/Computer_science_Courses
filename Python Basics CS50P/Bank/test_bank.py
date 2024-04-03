from bank import value

def test_bank():
    assert value("hello") == 0
    assert value("hey") == 20
    assert value("reujs") == 100
    assert value("1003") == 100
    assert value(" HAlooe") == 20
