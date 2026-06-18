# Java 문자열(String) 메서드 정리

## 목차
- [1. 문자열 조작 메서드](#1-문자열-조작-메서드)
- [2. 문자열 검색 메서드](#2-문자열-검색-메서드)
- [3. 문자열 비교 메서드](#3-문자열-비교-메서드)
- [4. 기타 문자열 메서드](#4-기타-문자열-메서드)

---

## 1. 문자열 조작 메서드

문자열을 변형하거나 가공해서 **새로운 문자열을 생성**하는 메서드들이다. (Java String은 불변(immutable)이므로 원본은 바뀌지 않고 항상 새 객체가 반환된다.)

| 메서드 | 설명 | 예시 | 결과 |
|--------|------|------|------|
| `substring(int begin)` | begin 인덱스부터 끝까지 자르기 | `"Hello".substring(2)` | `"llo"` |
| `substring(int begin, int end)` | begin ~ end-1 까지 자르기 (end 미포함) | `"Hello".substring(1, 4)` | `"ell"` |
| `replace(char old, char new)` | 문자 치환 | `"hello".replace('l', 'L')` | `"heLLo"` |
| `replace(CharSequence old, CharSequence new)` | 문자열 치환 (모두 변경) | `"banana".replace("an", "AN")` | `"bANANa"` |
| `replaceAll(String regex, String replacement)` | 정규식 기반 치환 (전체) | `"a1b2c3".replaceAll("[0-9]", "")` | `"abc"` |
| `replaceFirst(String regex, String replacement)` | 정규식 기반 치환 (첫 번째만) | `"a1b2c3".replaceFirst("[0-9]", "")` | `"ab2c3"` |
| `toUpperCase()` | 대문자로 변환 | `"abc".toUpperCase()` | `"ABC"` |
| `toLowerCase()` | 소문자로 변환 | `"ABC".toLowerCase()` | `"abc"` |
| `trim()` | 앞뒤 공백 제거 (ASCII 공백 기준) | `"  hi  ".trim()` | `"hi"` |
| `strip()` | 앞뒤 공백 제거 (유니코드 공백 포함, Java 11+) | `"  hi  ".strip()` | `"hi"` |
| `concat(String str)` | 문자열 이어붙이기 | `"hello".concat(" world")` | `"hello world"` |
| `split(String regex)` | 정규식 기준으로 문자열 분리 → String[] 반환 | `"a,b,c".split(",")` | `["a","b","c"]` |
| `join(CharSequence delimiter, CharSequence... elements)` | 구분자로 문자열 합치기 (static 메서드) | `String.join("-", "a","b","c")` | `"a-b-c"` |
| `toCharArray()` | 문자열을 char 배열로 변환 | `"abc".toCharArray()` | `['a','b','c']` |
| `format(String format, Object... args)` | 형식 문자열 생성 (static 메서드) | `String.format("%d개", 5)` | `"5개"` |
| `repeat(int count)` | 문자열 반복 (Java 11+) | `"ab".repeat(3)` | `"ababab"` |

> **주의**: `replace()`는 일반 문자열 그대로 치환, `replaceAll()`/`replaceFirst()`는 **정규식**으로 동작한다는 차이가 있다.

---

## 2. 문자열 검색 메서드

문자열 내부에서 특정 문자/문자열의 **위치를 찾거나 존재 여부를 확인**하는 메서드들이다.

| 메서드 | 설명 | 예시 | 결과 |
|--------|------|------|------|
| `indexOf(String str)` | 처음 등장하는 위치 반환 (없으면 -1) | `"hello".indexOf("l")` | `2` |
| `indexOf(String str, int fromIndex)` | fromIndex부터 검색 | `"hello".indexOf("l", 3)` | `3` |
| `lastIndexOf(String str)` | 마지막으로 등장하는 위치 반환 | `"hello".lastIndexOf("l")` | `3` |
| `contains(CharSequence s)` | 포함 여부 확인 (boolean) | `"hello".contains("ell")` | `true` |
| `startsWith(String prefix)` | 특정 문자열로 시작하는지 확인 | `"hello".startsWith("he")` | `true` |
| `endsWith(String suffix)` | 특정 문자열로 끝나는지 확인 | `"hello".endsWith("lo")` | `true` |
| `matches(String regex)` | 정규식 전체 매칭 여부 확인 | `"12345".matches("[0-9]+")` | `true` |
| `charAt(int index)` | 특정 인덱스의 문자 반환 | `"hello".charAt(1)` | `'e'` |

> **주의**: `indexOf`/`lastIndexOf`는 못 찾으면 **-1**을 반환하므로, 존재 여부 확인은 `contains()`를 쓰는 게 더 명확하다.

---

## 3. 문자열 비교 메서드

두 문자열이 같은지, 또는 정렬상 어떤 순서인지를 비교하는 메서드들이다.

| 메서드 | 설명 | 예시 | 결과 |
|--------|------|------|------|
| `equals(Object obj)` | 내용(값) 비교 (대소문자 구분) | `"abc".equals("abc")` | `true` |
| `equalsIgnoreCase(String str)` | 내용 비교 (대소문자 무시) | `"ABC".equalsIgnoreCase("abc")` | `true` |
| `compareTo(String str)` | 사전순 비교 (유니코드 코드값 차이 반환) | `"a".compareTo("b")` | `-1` (음수) |
| `compareToIgnoreCase(String str)` | 대소문자 무시한 사전순 비교 | `"A".compareToIgnoreCase("a")` | `0` |
| `==` (참고용, 메서드 아님) | 참조(주소) 비교 — 문자열 비교에는 사용하면 안 됨 | `new String("a") == new String("a")` | `false` |

> **핵심 함정**: `==`는 객체의 **참조(주소)**를 비교하고, `equals()`는 객체의 **값(내용)**을 비교한다.
> 문자열 리터럴(`"a"`)은 String Pool에 저장되어 `==`가 `true`로 나올 때도 있지만, `new String()`으로 생성한 경우는 항상 다른 객체이므로 `false`가 된다. **문자열 비교는 항상 `equals()`를 사용해야 한다.**

`compareTo()` 결과 해석:
- 음수 → 호출 문자열이 사전순으로 더 앞섬
- 0 → 두 문자열이 동일함
- 양수 → 호출 문자열이 사전순으로 더 뒤에 있음

---

## 4. 기타 문자열 메서드

위 세 분류에 속하지 않는, 길이 확인·빈 문자열 체크·타입 변환 등에 쓰이는 메서드들이다.

| 메서드 | 설명 | 예시 | 결과 |
|--------|------|------|------|
| `length()` | 문자열 길이 반환 | `"hello".length()` | `5` |
| `isEmpty()` | 길이가 0인지 확인 | `"".isEmpty()` | `true` |
| `isBlank()` | 공백만 있거나 길이 0인지 확인 (Java 11+) | `"   ".isBlank()` | `true` |
| `valueOf(Object obj)` | 다른 타입을 문자열로 변환 (static 메서드) | `String.valueOf(123)` | `"123"` |
| `intern()` | String Pool에 등록 후 참조 반환 | `new String("a").intern()` | Pool의 `"a"` 참조 |
| `hashCode()` | 문자열의 해시코드 반환 | `"abc".hashCode()` | (정수 해시값) |
| `chars()` | 문자열을 IntStream으로 변환 (Java 8+) | `"abc".chars().count()` | `3` |
| `String(char[] value)` | char 배열로 String 생성 (생성자) | `new String(new char[]{'a','b'})` | `"ab"` |

---

## 빠르게 비교: 헷갈리기 쉬운 메서드 정리

| 비교 대상 | 차이점 |
|-----------|--------|
| `replace()` vs `replaceAll()` | `replace()`는 일반 문자열 치환, `replaceAll()`은 **정규식** 치환 |
| `trim()` vs `strip()` | `strip()`은 유니코드 공백까지 처리 (Java 11+에서 권장) |
| `equals()` vs `==` | `equals()`는 값 비교, `==`는 참조 비교 |
| `indexOf()` 못 찾을 때 | 예외(Exception)가 아니라 **-1 반환** |
| `String.format()` vs `concat()` | `format()`은 형식 지정 문자열 생성, `concat()`은 단순 이어붙이기 |