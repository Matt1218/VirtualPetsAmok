# Virtual Pets Amok
I used a Hashmap instead of an ArrayList this time.
User can have either organic or robotic pets and within those, they can choose whether it's a cat or dog. Robotic and Organic dogs can be walked. Cats cannot be walked. 
For the robotic pets, the oil and luster levels go down with the tick method or if they are walked. User needs to add oil and polish robotic pets for those values to go up.
The user can only play with organic pets.

The OrganicPet, RoboticPet, and VirtualPet classes are abstract. The OrganicPet and RoboticPet classes extend VirtualPet.
I have two subclasses for OrganicPet and RoboticPet.
Tickable and Walkable classes are both interfaces.
Only the OrganicDog and RoboticDog classes implement Walkable. 
Both RoboticPet and OrganicPet implement Tickable.
