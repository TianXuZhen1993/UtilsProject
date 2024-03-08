package com.tian.utilsproject.delegate

/**
 *
 *
 * @author TXZ
 * @version 1.0
 * created by 2024/3/5 17:01
 */
class LogUtils(imp: LogInterface) : LogInterface by imp {
}