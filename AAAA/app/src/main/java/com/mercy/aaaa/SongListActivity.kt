package com.mercy.aaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SongListActivity : AppCompatActivity() {

    private val songs = listOf(
        Song("Twenty One Pilots", "Chlorine","https://images.genius.com/603b8f7dacc0e863ccfe0014253e4f86.600x600x1.jpg", "So where are you? It's been a little while\n" +
                "Sippin' on straight chlorine, let the vibes slide over me\n" +
                "This beat is a chemical, beat is a chemical\n" +
                "When I leave don't save my seat, I'll be back when it's all complete\n" +
                "The moment is medical, moment is medical\n" +
                "Sippin' on straight chlorine\n" +
                "Lovin' what I'm tastin'\n" +
                "Venom on my tongue\n" +
                "Dependant at times\n" +
                "Poisonous vibration\n" +
                "Help my body run\n" +
                "I'm runnin' for my li-i-i-i-i-i-fe\n" +
                "Runnin' for my li-i-i-i-i-i-fe\n" +
                "Sippin' on straight chlorine, let the vibes slide over me\n" +
                "This beat is a chemical, beat is a chemical\n" +
                "When I leave don't save my seat, I'll be back when it's all complete\n" +
                "The moment is medical, moment is medical\n" +
                "Sippin' on straight chlorine\n" +
                "Fall out of formation\n" +
                "I plan my escape from walls they confined\n" +
                "Rebel red carnation\n" +
                "Grows while I decay\n" +
                "I'm runnin' for my li-i-i-i-i-i-fe\n" +
                "Runnin' for my li-i-i-i-i-i-fe\n" +
                "Yeah, I'm runnin' for my li-i-i-i-i-i-fe\n" +
                "Runnin' for my li-i-i-i-i-i-fe\n" +
                "Had you in my coat pocket, where I kept my rebel red\n" +
                "I felt I was invincible, you wrapped around my head\n" +
                "Now different lives I lead, my body lives on lead\n" +
                "The last two lines may read incorrect until said\n" +
                "The lead is terrible in flavor\n" +
                "But now you double as a papermaker\n" +
                "I despise you sometimes\n" +
                "I love to hate the fight and you in my life is like\n" +
                "Sippin' on straight chlorine, let the vibes slide over me\n" +
                "This beat is a chemical, beat is a chemical\n" +
                "When I leave don't save my seat, I'll be back when it's all complete\n" +
                "The moment is medical, moment is medical\n" +
                "Sippin' on straight chlorine\n" +
                "Let the vibe, let the vibe\n" +
                "Let the vibe, let the vibe\n" +
                "Beat is a chemical, yeah\n" +
                "Let the vibe, let the vibe\n" +
                "Let the vibe, let the vibe\n" +
                "Moment is medical, yeah\n" +
                "Sippin' on straight chlorine\n" +
                "Let the vibe, let the vibe\n" +
                "Let the vibe, let the vibe\n" +
                "Beat is a chemical, yeah\n" +
                "Let the vibe, let the vibe\n" +
                "Let the vibe, let the vibe\n" +
                "Moment is medical, yeah\n" +
                "I'm so sorry, I forgot you\n" +
                "Let me catch you up to speed\n" +
                "I've been tested like the ends of\n" +
                "A weathered flag that's by the sea\n" +
                "Can you build my house with pieces?\n" +
                "I'm just a chemical\n" +
                "Can you build my house with pieces?\n" +
                "I'm just a chemical\n" +
                "Can you build my house with pieces?\n" +
                "I'm just a chemical\n" +
                "Can you build my house with pieces?\n" +
                "I'm just a chemical"),



        Song("Twenty One Pilots", "My Blood", "https://i1.sndcdn.com/artworks-IxOSP1eBd9hR8h8k-k5yPDA-t500x500.jpg", "When everyone\n" +
                "You thought you knew\n" +
                "Deserts your fight\n" +
                "I'll go with you\n" +
                "You're facing down\n" +
                "A dark hall\n" +
                "I'll grab my light\n" +
                "And go with you\n" +
                "I'll go with you\n" +
                "I'll go with you\n" +
                "I'll go with you\n" +
                "I'll go with you\n" +
                "I'll go with you\n" +
                "I'll go with you\n" +
                "I'll go with you\n" +
                "Surrounded and\n" +
                "Up against a wall\n" +
                "I'll shred them all\n" +
                "And go with you\n" +
                "When choices end\n" +
                "You must defend\n" +
                "I'll grab my bat\n" +
                "And go with you\n" +
                "I'll go with you\n" +
                "I'll go with you\n" +
                "I'll go with you\n" +
                "Yeah\n" +
                "Stay with me\n" +
                "No, you don't need to run\n" +
                "Stay with me, my blood\n" +
                "You don't need to run\n" +
                "Stay with me\n" +
                "No, you don't need to run\n" +
                "Stay with me, my blood\n" +
                "You don't need to run\n" +
                "If there comes a day\n" +
                "People posted up at the end of your driveway\n" +
                "They're calling for your head and they're calling for your name\n" +
                "I'll bomb down on them, I'm coming through\n" +
                "Do they know I was grown with you?\n" +
                "If they're here to smoke, know I'll go with you\n" +
                "Just keep it outside, keep it outside, yeah\n" +
                "Stay with me\n" +
                "No, you don't need to run\n" +
                "Stay with me, my blood\n" +
                "You don't need to run\n" +
                "Stay with me\n" +
                "No, you don't need to run\n" +
                "Stay with me, my blood\n" +
                "You don't need to run\n" +
                "You don't need to run\n" +
                "(Oh-oh oh-oh)\n" +
                "You don't need to run\n" +
                "(Oh-oh oh-oh)\n" +
                "You don't need to run\n" +
                "(Oh-oh oh-oh)\n" +
                "You don't need to run\n" +
                "If you find yourself\n" +
                "In a lion's den\n" +
                "I'll jump right in\n" +
                "And pull my pin\n" +
                "And go with you\n" +
                "I'll go with you\n" +
                "I'll go with you\n" +
                "I'll go with you (you don't need to run)\n" +
                "I'll go with you\n" +
                "I'll go with you (you don't need to run)\n" +
                "I'll go with you\n" +
                "My blood, I'll go with you\n" +
                "Yeah\n" +
                "Stay with me\n" +
                "No, you don't need to run\n" +
                "Stay with me, my blood\n" +
                "You don't need to run\n" +
                "Stay with me\n" +
                "No, you don't need to run\n" +
                "Stay with me, my blood\n" +
                "You don't need to run\n" +
                "You don't need to run\n" +
                "(Oh-oh oh-oh)\n" +
                "You don't need to run\n" +
                "(Oh-oh oh-oh)\n" +
                "You don't need to run\n" +
                "(Oh-oh oh-oh)\n" +
                "You don't need to run\n" +
                "Stay with me\n" +
                "No, you don't need to run\n" +
                "Stay with me, my blood"),



        Song("Twenty One Pilots", "Ride", "https://i.scdn.co/image/ab67616d0000b273de03bfc2991fd5bcfde65ba3", "I just wanna stay in the sun where I find\n" +
                "I know it's hard sometimes\n" +
                "Pieces of peace in the sun's peace of mind\n" +
                "I know it's hard sometimes\n" +
                "Yeah, I think about the end just way too much\n" +
                "But it's fun to fantasize\n" +
                "On my enemies who wouldn't wish who I was\n" +
                "But it's fun to fantasize\n" +
                "Oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh\n" +
                "I'm fallin' so I'm taking my time on my ride\n" +
                "Oh, oh, oh, oh\n" +
                "I'm fallin' so I'm taking my time on my ride\n" +
                "Takin' my time on my ride\n" +
                "\"I'd die for you\" that's easy to say\n" +
                "We have a list of people that we would take\n" +
                "A bullet for them, a bullet for you\n" +
                "A bullet for everybody in this room\n" +
                "But I don't seem to see many bullets coming through\n" +
                "See many bullets coming through\n" +
                "Metaphorically, I'm the man\n" +
                "But literally, I don't know what I'd do\n" +
                "\"I'd live for you\" and that's hard to do\n" +
                "Even harder to say, when you know it's not true\n" +
                "Even harder to write, when you know that's a lie\n" +
                "There were people back home who tried talking to you\n" +
                "But then you ignore them still\n" +
                "All these questions they're for real, like\n" +
                "\"Who would you live for?\"\n" +
                "\"Who would you die for?\"\n" +
                "And \"Would you ever kill?\"\n" +
                "Oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh\n" +
                "I'm fallin' so I'm taking my time on my ride\n" +
                "Oh, oh, oh, oh\n" +
                "I'm fallin' so I'm taking my time on my ride\n" +
                "Takin' my time on my ride\n" +
                "I've been thinking too much\n" +
                "I've been thinking too much\n" +
                "I've been thinking too much\n" +
                "I've been thinking too much (Help me)\n" +
                "I've been thinking too much (I've been thinking too much)\n" +
                "I've been thinking too much (Help me)\n" +
                "I've been thinking too much (I've been thinking too much)\n" +
                "I've been thinking too much\n" +
                "Oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh\n" +
                "I'm fallin' so I'm taking my time on my ride\n" +
                "Oh, oh, oh, oh\n" +
                "I'm fallin' so I'm taking my time\n" +
                "Takin' my time on my ride\n" +
                "Whoa, oh, oh\n" +
                "Oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh\n" +
                "I'm fallin' so I'm taking my time on my ride\n" +
                "Oh, oh, oh, oh\n" +
                "I'm fallin' so I'm takin' my time on my-\n" +
                "I've been thinking too much (Help me)\n" +
                "I've been thinking too much (Help me)\n" +
                "I've been thinking too much (I've been thinking too much)\n" +
                "I've been thinking too much (Help me)\n" +
                "I've been thinking too much (I've been thinking too much)\n" +
                "I've been thinking too much (Help me)")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_list)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = SongListAdapter(songs) { song ->
            val intent = Intent(this, SongDetailActivity::class.java)
            intent.putExtra("song", song)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }
}
