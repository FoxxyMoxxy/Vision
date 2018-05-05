/*
Copyright 2017 Rice University

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

import edu.rice.cs.caper.vision.annotations.Evidence;
import android.bluetooth.BluetoothAdapter;

public class TestBluetooth {

    void readFromBluetooth(BluetoothAdapter adapter) {
        String address = "00:43:A8:23:10:F0";
        {
            Evidence.apicalls("getInputStream");
            Evidence.types("BluetoothSocket");
        }
    }

}
