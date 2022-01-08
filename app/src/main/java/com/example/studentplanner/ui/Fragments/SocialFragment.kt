package com.example.studentplanner.ui.Fragments

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.studentplanner.databinding.FragmentSocialBinding


class SocialFragment : Fragment() {

    lateinit var binding: FragmentSocialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentSocialBinding.inflate(layoutInflater,container,false)

        binding.instaButton.setOnClickListener{
            val uri = Uri.parse("https://instagram.com/nss_vce?utm_medium=copy_link")
            val instagram = Intent(Intent.ACTION_VIEW, uri)
            instagram.setPackage("com.instagram.android")
            try {
                startActivity(instagram)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/nss_vce?utm_medium=copy_link")))

            }
        }

        binding.whatsappButton.setOnClickListener{
            val urii = Uri.parse("https://chat.whatsapp.com/CJVSpbxBzKw4XP2rY3RecK")
            val whatsapp = Intent(Intent.ACTION_VIEW, urii)
            whatsapp.setPackage("com.whatsapp.android")
            try {
                startActivity(whatsapp)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://chat.whatsapp.com/CJVSpbxBzKw4XP2rY3RecK")))

            }
        }


        binding.mapButton.setOnClickListener{
            val uriii = Uri.parse("https://maps.app.goo.gl/iac9TBY2GzMAvbRj6")
            val map = Intent(Intent.ACTION_VIEW, uriii)
            map.setPackage("com.map.android")
            try {
                startActivity(map)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/iac9TBY2GzMAvbRj6")))

            }
        }

        binding.fbButton.setOnClickListener{
            val uriiii = Uri.parse("https://www.facebook.com/TeachForIbrahimbagh/")
            val facebook = Intent(Intent.ACTION_VIEW, uriiii)
            facebook.setPackage("com.facebook.android")
            try {
                startActivity(facebook)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/TeachForIbrahimbagh/")))

            }
        }

        return binding.root
    }


}