# FragmentDemo

📚 Official Documentation Links


📖 Android Fragments - Official Docs

🔹 [Fragments](https://developer.android.com/guide/fragments)

📖 ViewPager2 - Official Docs

🔹 [ViewPager2](https://developer.android.com/reference/androidx/viewpager2/widget/ViewPager2)

📖 FragmentStateAdapter - Official Docs

🔹 [FragmentStateAdapter](https://developer.android.com/reference/androidx/viewpager2/adapter/FragmentStateAdapter)

📖 TabLayoutMediator - Official Docs

🔹 [TabLayoutMediator](https://developer.android.com/reference/com/google/android/material/tabs/TabLayoutMediator)

---
📌 Task Definition: Multi-Screen Data Sharing with ViewPager2 & TabLayout

📌 Task Requirements:

1️⃣ Implement ViewPager2 & TabLayout with three fragments.

2️⃣ Pass data from Fragment A → Fragment B & Fragment C using Bundle.

3️⃣ Fragment B should modify the received data and send it back to Fragment A.

4️⃣ Fragment C should display text in uppercase and also allow resetting the data.

</br>

📌 Expected Flow:

1️⃣ User enters text in Fragment A and clicks “Send”.

2️⃣ Fragment B displays the received text but also has a “Modify & Send Back” button that modifies the text and updates Fragment A.

3️⃣ Fragment C displays the received text in uppercase and has a “Reset” button that clears the text in all fragments.

</br>

💡 Hints:

- Use setArguments() and getArguments() to pass data initially.

- Use setFragmentResult() and setFragmentResultListener() to send modified data back.
	
- Handle the “Reset” action properly, ensuring all fragments clear their text when clicked.

