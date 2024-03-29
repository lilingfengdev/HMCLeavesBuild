/*
 *
 *  *     HMCLeaves
 *  *     Copyright (C) 2022  Hibiscus Creative Studios
 *  *
 *  *     This program is free software: you can redistribute it and/or modify
 *  *     it under the terms of the GNU General Public License as published by
 *  *     the Free Software Foundation, either version 3 of the License, or
 *  *     (at your option) any later version.
 *  *
 *  *     This program is distributed in the hope that it will be useful,
 *  *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  *     GNU General Public License for more details.
 *  *
 *  *     You should have received a copy of the GNU General Public License
 *  *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

plugins {
    id("java")
}

group = "io.github.fisher2911"
version = "1.1.2"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://oss.sonatype.org/content/repositories/central")
    maven("https://jitpack.io")
    maven("https://maven.enginehub.org/repo/")
    maven("https://repo.codemc.io/repository/maven-snapshots/")
    maven("https://mvn.lumine.io/repository/maven-public/") { metadataSources { artifact() } }
    maven("https://repo.xenondevs.xyz/releases")
    maven("https://repo.hibiscusmc.com/snapshots")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.18.1-R0.1-SNAPSHOT")
    compileOnly("com.github.oraxen:oraxen:1.168.0")
    compileOnly("com.github.LoneDev6:api-itemsadder:3.0.0")
    compileOnly("org.xerial:sqlite-jdbc:3.39.2.0")
    compileOnly("com.sk89q.worldedit:worldedit-core:7.2.14-SNAPSHOT")
    compileOnly("com.sk89q.worldedit:worldedit-bukkit:7.2.14-SNAPSHOT")
    compileOnly("io.lumine:MythicCrucible:1.6.0-SNAPSHOT")
    compileOnly("io.lumine:Mythic-Dist:5.2.1")
    compileOnly("xyz.xenondevs.nova:nova-api:0.14.7")
    implementation("com.zaxxer:HikariCP:3.3.0")
    implementation("org.bstats:bstats-bukkit:3.0.0")
    implementation(platform("com.intellectualsites.bom:bom-1.18.x:1.19"))
    implementation("com.github.retrooper.packetevents:spigot:2.2.0")
    implementation("io.github.fisher2911.FisherLib:common:1.0.3-beta")
}
