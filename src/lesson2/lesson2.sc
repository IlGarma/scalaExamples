def isVowel (c : Char) = {
  c == 'a' || c == 'e' || c== 'o' || c == 'i' || c == 'u'
}

isVowel('p')
isVowel('a')

def returnAllVowels (text : String) = {
  for (character <- text if isVowel(character))
    yield (character)
}

returnAllVowels("peppe")


def returnAllVowels2 (text : String) = {
  var text2 = "";
  for (c <- text)
     if (isVowel(c)) text2 += c.toString
  text2
}

returnAllVowels2("peppe")


def returnAllVowels3 (text : String) : String = {
  if (text.length == 0) ""
  else {
    val c = text(0)
    val rest = returnAllVowels3(text.substring(1))
    if (isVowel(c)) c + rest else rest
  }
}

returnAllVowels3("peppe")


def returnAllVowels4 (text : String) = {
  var text2 = "";
  var i=0;

  while (i < text.length) {

    if (isVowel(text(i))) text2 += text(i)
    i+=1
  }
  text2
}

returnAllVowels4("peppe")

def returnAllVowels5 (text: String, vowels: String = "aeiou" ,
                     ignoreCase : Boolean = true) = {

  val text2 = if (ignoreCase) {
    text.toLowerCase
  } else {
    text
  }
  for (c<-text2 if vowels.contains(c)) yield c

}

returnAllVowels5("peppE")
returnAllVowels5("peppE", ignoreCase = false)
returnAllVowels5("peppE", ignoreCase = false, vowels = "p")