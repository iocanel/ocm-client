/**
 * Copyright 2020 The original authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
**/

package io.fabric8.ocm;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class Strings {

    private static final String DEFAULT_LIST_DELIMITER = ", ";

    private Strings() {
        //Utility class
    }

    /**
     * Checks if string is either null or empty.
     * @param str the string to check
     * @return true if the specified string is null or empty, false otherwise
     */
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * Checks if string is neither null nor empty.
     * @param str the string to check
     * @return true if the specified string is neither null nor empty, false otherwise
     */
    public static boolean isNotNullOrEmpty(String str) {
        return !isNullOrEmpty(str);
    }

    /**
     * Join the array into a string.
     * The items of the array are converted to string and are joined in a comma separated list.
     * @param <T> the type of the array
     * @param array the target array
     * @return the comman separated list as string
     */
    public static <T> String join(final T[] array) {
        return join(array, t -> t.toString(), DEFAULT_LIST_DELIMITER);
    }

    /**
     * Join the array into a string.
     * The items of the array are converted to string and are joined in a delimited list.
     * @param <T> the type of the array
     * @param array the target array
     * @param delimiter the delimiter to use
     * @return the delimited list as string
     */
    public static <T> String join(final T[] array, String delimiter) {
        return join(array, t -> t.toString(), delimiter);
    }

    /**
     * Join the array into a string.
     * The items of the array are converted to string and are joined in a comma separated list.
     * @param <T> the type of the array
     * @param array the target array
     * @param function the function to use for converting the list items to strings
     * @return the comman separated list as string
     */
    public static <T> String join(final T[] array, Function<T, String> function) {
        return join(array, function, DEFAULT_LIST_DELIMITER);
    }

    /**
     * Join the array into a string.
     * The items of the array are converted to string and are joined in a delimited list.
     * @param <T> the type of the array
     * @param array the target array
     * @param function the function to use for converting the list items to strings
     * @param delimiter the delimiter to use
     * @return the delimited list as string
     */
    public static <T> String join(final T[] array, Function<T, String> function, String delimiter) {
        return Arrays.stream(array).map(function).collect(Collectors.joining(delimiter));
    }
}
