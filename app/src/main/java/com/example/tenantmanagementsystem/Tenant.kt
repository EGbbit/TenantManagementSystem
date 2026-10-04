package com.example.tenantmanagementsystem

data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) {
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}
