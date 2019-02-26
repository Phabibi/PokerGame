import scala.util.Random

object Suits extends Enumeration 
{
	 type Suits = Value
	 val  Hearts , Spade , Clubs , Diamonds = Value 
}
class Card ( Number : Int , Suit : Suits.Value)
	{
		
		def show_card()
		{
			println(this.Number, this.Suit)
		}
		def getsuit()
		{
			println(this.Suit)
		}

		def getNumber()
		{
			println(this.Number)
		}

	}
class dequeofcards (Cards: Array[Card])
{
	def getNumCards()
	{
		println(this.Cards.length)
	}
}

object Classes{
	def main (args:  Array[String] ) ={
		val pt = new Card(2,Suits.Hearts)
		val  a = (Suits.Hearts.id)
		pt.getsuit()
		pt.getNumber()
		println(a)
		cardFill()

	}

	def cardFill()
	{
		val card_arr= new Array[Card](52)
		for (i <- 0 to Suits.maxId-1)
		{
			
			for(j <- 1 to 13)
			{
				val card = new Card(j , Suits.apply(i)) 
				val arr = Array(card)
				arr ++ card_arr
				
		
		

				
				
			}
		}
		
		card_arr.filter(_ != null).map(x =>println(x))

	}

	def cardShuffle(card_arr: Array[Card])
	{

		
	}

}