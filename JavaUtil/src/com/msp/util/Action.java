package com.msp.util;
enum Action {
    DODGE {
        public boolean execute(Player player) {
            if (player.isAttacking())
                return true;
            return false;
        }
    },
    ATTACK {
        public boolean execute(Player player) {
            if (player.hasWeapon())
                return true;
            return false;
        }
    },
    JUMP {
        public boolean execute(Player player) {
            if (player.getCoordinates().equals(new Coordinates(0, 0)))
                return true;
            return false;
        }
    };

    public abstract boolean execute(Player player);
}
