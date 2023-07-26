package de.bitbrain.braingdx.world;

import de.bitbrain.braingdx.util.Mutator;

public class addObjectParameters {
    private final Object group;
    private final Mutator<GameObject> mutator;
    private final boolean lazy;

    /**
     * @param mutator the mutator which might change the GameObject
     *
     */
    public addObjectParameters(Object group, Mutator<GameObject> mutator, boolean lazy) {
        this.group = group;
        this.mutator = mutator;
        this.lazy = lazy;
    }

    public Object getGroup() {
        return group;
    }

    public Mutator<GameObject> getMutator() {
        return mutator;
    }

    public boolean isLazy() {
        return lazy;
    }
}
