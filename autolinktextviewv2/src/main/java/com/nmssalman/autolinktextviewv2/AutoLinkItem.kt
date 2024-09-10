package com.nmssalman.autolinktextviewv2

data class AutoLinkItem(var startPoint: Int,
                        var endPoint: Int,
                        val originalText: String,
                        val transformedText: String,
                        val mode: Mode)
