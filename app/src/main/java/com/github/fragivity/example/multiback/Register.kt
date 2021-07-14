/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.fragivity.example.multiback

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.github.fragivity.example.R
import com.github.fragivity.navigator
import com.github.fragivity.push

/**
 * Shows a register form to showcase UI state persistence. It has a button that goes to [Registered]
 */
class Register : Fragment(R.layout.multi_back_fragment_register) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.signup_btn).setOnClickListener {
            navigator.push { Registered() }
        }
    }
}

class Registered : Fragment(R.layout.multi_back_fragment_registered)