/**********************************************************************************************
 * Copyright (c) 2012-2017  DCA-FEEC-UNICAMP
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * Contributors:
 *     K. Raizer, A. L. O. Paraense, E. M. Froes, R. R. Gudwin - initial API and implementation
 **********************************************************************************************/

package br.unicamp.cst.core.entities;

import br.unicamp.cst.bindings.soar.PlansSubsystemModule;
import br.unicamp.cst.motivational.MotivationalSubsystemModule;
import br.unicamp.cst.bindings.soar.PlansSubsystemViewer;

/**
 * @author andre
 */
public class Mind {

    protected CodeRack codeRack;

    protected RawMemory rawMemory;

    private MotivationalSubsystemModule motivationalSubsystemModule;

    private PlansSubsystemModule plansSubsystemModule;

    public Mind() {
        codeRack = new CodeRack();

        rawMemory = new RawMemory();

        motivationalSubsystemModule = new MotivationalSubsystemModule();

        plansSubsystemModule = new PlansSubsystemModule();
    }

    /**
     * @return the codeRack
     */
    public synchronized CodeRack getCodeRack() {
        return codeRack;
    }

    /**
     * @return the rawMemory
     */
    public synchronized RawMemory getRawMemory() {
        return rawMemory;
    }

    public synchronized MemoryContainer createMemoryContainer(String name) {

        MemoryContainer mc = null;

        if (rawMemory != null)
            mc = rawMemory.createMemoryContainer(name);

        return mc;

    }


    /**
     * Creates a new MemoryObject (Java style) and adds it to the Raw Memory, using provided info and type
     *
     * @param name memory object name
     * @param info memory object info
     * @return mo created MemoryObject
     */
    public synchronized MemoryObject createMemoryObject(String name, Object info) {
        MemoryObject mo = null;

        if (rawMemory != null)
            mo = rawMemory.createMemoryObject(name, info);

        return mo;
    }

    public synchronized MemoryObject createMemoryObject(String name) {
        return createMemoryObject(name, null);
    }

    public Codelet insertCodelet(Codelet co) {
        if (codeRack != null)
            codeRack.addCodelet(co);

        return co;
    }

    /**
     * Starts all codelets in coderack.
     */
    public void start() {
        if (codeRack != null)
            codeRack.start();
    }

    /**
     * Stops codelets thread.
     */
    public void shutDown() {
        if (codeRack != null)
            codeRack.shutDown();
    }

    /**
     * @return the motivationalSubsystemModule
     */
    public MotivationalSubsystemModule getMotivationalSubsystemModule() {
        return motivationalSubsystemModule;
    }

    /**
     * @param motivationalSubsystemModule the motivationalSubsystemModule to set
     */
    public void setMotivationalSubsystemModule(MotivationalSubsystemModule motivationalSubsystemModule) {
        this.motivationalSubsystemModule = motivationalSubsystemModule;
    }

    public PlansSubsystemModule getPlansSubsystemModule() {
        return plansSubsystemModule;
    }

    public void setPlansSubsystemModule(PlansSubsystemModule plansSubsystemModule) {
        this.plansSubsystemModule = plansSubsystemModule;
    }
}
