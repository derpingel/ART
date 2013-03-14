/*
 * Copyright (C) 2011 The Android Open Source Project
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
package de.anddisa.adb.device;

import com.android.ddmlib.IDevice;

/**
 * A placeholder {@link IDevice} used by {@link DeviceManager} to allocate when
 * {@link IDeviceSelection#nullDeviceRequested()} is <code>true</code>
 */
class NullDevice extends StubDevice {

    NullDevice(String serial) {
        super(serial, false);
    }
}
