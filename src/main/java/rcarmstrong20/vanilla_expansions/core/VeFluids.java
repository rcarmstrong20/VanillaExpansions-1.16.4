package rcarmstrong20.vanilla_expansions.core;

import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rcarmstrong20.vanilla_expansions.VanillaExpansions;
import rcarmstrong20.vanilla_expansions.fluid.VeDarkMatterFluid;

/**
 * A class for holding every fluid instance that vanilla expansions has.
 *
 * @author Ryan
 */
@Mod.EventBusSubscriber(modid = VanillaExpansions.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VeFluids
{
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
            VanillaExpansions.MOD_ID);

    public static Fluid darkMatter = register("dark_matter", new VeDarkMatterFluid.Source());
    public static FlowingFluid flowingDarkMatter = register("flowing_dark_matter", new VeDarkMatterFluid.Flowing());

    /**
     * @param name  A name for the fluid.
     * @param fluid A new instance of flowing fluid.
     * @return A new fluid.
     */
    private static FlowingFluid register(String name, FlowingFluid fluid)
    {
        FLUIDS.register(name, () -> fluid);
        return fluid;
    }
}
