package org.jetbrains.kotlinx.spark.api.tuples

import scala.*

fun <T, R, T1: T> Tuple1<T1>.map(func: (T) -> R): Tuple1<R> = Tuple1<R>(func(this._1()))
fun <T, R, T1: T, T2: T> Tuple2<T1, T2>.map(func: (T) -> R): Tuple2<R, R> = Tuple2<R, R>(func(this._1()), func(this._2()))
fun <T, R, T1: T, T2: T, T3: T> Tuple3<T1, T2, T3>.map(func: (T) -> R): Tuple3<R, R, R> = Tuple3<R, R, R>(func(this._1()), func(this._2()), func(this._3()))
fun <T, R, T1: T, T2: T, T3: T, T4: T> Tuple4<T1, T2, T3, T4>.map(func: (T) -> R): Tuple4<R, R, R, R> = Tuple4<R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T> Tuple5<T1, T2, T3, T4, T5>.map(func: (T) -> R): Tuple5<R, R, R, R, R> = Tuple5<R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T> Tuple6<T1, T2, T3, T4, T5, T6>.map(func: (T) -> R): Tuple6<R, R, R, R, R, R> = Tuple6<R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T> Tuple7<T1, T2, T3, T4, T5, T6, T7>.map(func: (T) -> R): Tuple7<R, R, R, R, R, R, R> = Tuple7<R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>.map(func: (T) -> R): Tuple8<R, R, R, R, R, R, R, R> = Tuple8<R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.map(func: (T) -> R): Tuple9<R, R, R, R, R, R, R, R, R> = Tuple9<R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>.map(func: (T) -> R): Tuple10<R, R, R, R, R, R, R, R, R, R> = Tuple10<R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>.map(func: (T) -> R): Tuple11<R, R, R, R, R, R, R, R, R, R, R> = Tuple11<R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>.map(func: (T) -> R): Tuple12<R, R, R, R, R, R, R, R, R, R, R, R> = Tuple12<R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>.map(func: (T) -> R): Tuple13<R, R, R, R, R, R, R, R, R, R, R, R, R> = Tuple13<R, R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()), func(this._13()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>.map(func: (T) -> R): Tuple14<R, R, R, R, R, R, R, R, R, R, R, R, R, R> = Tuple14<R, R, R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()), func(this._13()), func(this._14()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>.map(func: (T) -> R): Tuple15<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R> = Tuple15<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()), func(this._13()), func(this._14()), func(this._15()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T> Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>.map(func: (T) -> R): Tuple16<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R> = Tuple16<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()), func(this._13()), func(this._14()), func(this._15()), func(this._16()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T> Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>.map(func: (T) -> R): Tuple17<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R> = Tuple17<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()), func(this._13()), func(this._14()), func(this._15()), func(this._16()), func(this._17()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T> Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>.map(func: (T) -> R): Tuple18<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R> = Tuple18<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()), func(this._13()), func(this._14()), func(this._15()), func(this._16()), func(this._17()), func(this._18()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T> Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>.map(func: (T) -> R): Tuple19<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R> = Tuple19<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()), func(this._13()), func(this._14()), func(this._15()), func(this._16()), func(this._17()), func(this._18()), func(this._19()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T> Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>.map(func: (T) -> R): Tuple20<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R> = Tuple20<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()), func(this._13()), func(this._14()), func(this._15()), func(this._16()), func(this._17()), func(this._18()), func(this._19()), func(this._20()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T, T21: T> Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>.map(func: (T) -> R): Tuple21<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R> = Tuple21<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()), func(this._13()), func(this._14()), func(this._15()), func(this._16()), func(this._17()), func(this._18()), func(this._19()), func(this._20()), func(this._21()))
fun <T, R, T1: T, T2: T, T3: T, T4: T, T5: T, T6: T, T7: T, T8: T, T9: T, T10: T, T11: T, T12: T, T13: T, T14: T, T15: T, T16: T, T17: T, T18: T, T19: T, T20: T, T21: T, T22: T> Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>.map(func: (T) -> R): Tuple22<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R> = Tuple22<R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R, R>(func(this._1()), func(this._2()), func(this._3()), func(this._4()), func(this._5()), func(this._6()), func(this._7()), func(this._8()), func(this._9()), func(this._10()), func(this._11()), func(this._12()), func(this._13()), func(this._14()), func(this._15()), func(this._16()), func(this._17()), func(this._18()), func(this._19()), func(this._20()), func(this._21()), func(this._22()))