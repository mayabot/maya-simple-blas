package com.mayabot.blas

import com.google.common.base.Preconditions.checkArgument


/**
 * 矩阵和向量相乘，结果保存到target向量里面
 */
fun matrixMulVector(matrix: FloatMatrix, v: Vector, target: MutableVector) {
    checkArgument(matrix.rows() == target.length())
    checkArgument(matrix.cols() == v.length())

    val m_ = matrix.rows()
    for (i in 0 until m_) {
        var x = 0f
        for (j in 0 until matrix.cols()) {
            x += matrix[i, j] * v[j]
        }
        target[i] = x
    }
}
