from exercise_12 import email_validator


def test_username_can_only_contain_letters():
    assert email_validator("aaaa@nomewebsite.ext") is None


def test_username_can_contain_letters_and_digits():
    assert email_validator("a1993@nomewebsite.ext") is None


def test_username_can_contain_letters_digits_and_dashes():
    assert email_validator("aa-a@nomewebsite.ext") is None


def test_username_can_contain_letters_digits_dashes_and_underscores():
    assert email_validator("a_a1a-a@nomewebsite.ext") is None


def test_username_should_starts_with_letter():
    assert email_validator("a@nomewebsite.ext") is None


def test_username_when_doesnt_start_with_letter_raise_exception():
    with pytest.raises(ValueError):
        email_validator("1@nomewebsite.ext")


def test_username_is_invalid_raise_exception():
    with pytest.raises(ValueError):
        email_validator("a%a@nomewebsite.ext")


def test_website_contain_only_letters_and_digits():
    assert email_validator("abc@website123.com") is None


def test_website_invalid_chars_raise_exception():
    with pytest.raises(ValueError):
        email_validator("abc@website!123.com")


def test_extension_should_contain_only_three_chars():
    assert email_validator("abc@website123.com") is None


def test_extension_invalid_chars_raise_exception():
    with pytest.raises(ValueError):
        email_validator("abc@website123.pyth")
