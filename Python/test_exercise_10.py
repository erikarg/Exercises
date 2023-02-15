from exercise_10 import fizzbuzz


def test_number_divisble_by_three_must_be_fizz():
    assert fizzbuzz(3)[-1] == "Fizz"


def test_number_divisble_by_five_must_be_buzz():
    assert fizzbuzz(5)[-1] == "Buzz"


def test_number_divisble_by_five_and_three_must_be_fizzbuzz():
    assert fizzbuzz(15)[-1] == "FizzBuzz"
