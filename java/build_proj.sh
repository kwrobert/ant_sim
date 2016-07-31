#!/bin/bash

# Parent directory for project
PROJ_DIR="/Users/Kyle/Projects/ant_sim/java"

# Remove old class files
rm -r $PROJ_DIR/classes/*

# Compile
javac -d "$PROJ_DIR/classes/" "$PROJ_DIR/antsim/Ant.java"
javac -d "$PROJ_DIR/classes/" "$PROJ_DIR/antsim/AntHill.java"
javac -d "$PROJ_DIR/classes/" "$PROJ_DIR/antsim/AntSimulation.java"

# Execute
#java antsim.AntSimulation
