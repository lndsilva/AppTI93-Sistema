package br.com.local.appti93_sistema;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class PageAdapterPets extends FragmentPagerAdapter {

    //Criar uma variável global para informar a quantidade de itens no tablayout
    private int tabCount;

    public PageAdapterPets(@NonNull @NotNull FragmentManager fm, int tabCount) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        this.tabCount = tabCount;

    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new CachorroFragment();
            case 1:
                return new GatoFragment();
            case 2:
                return new PeixeFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }

    @Override
    public int getItemPosition(@NonNull @NotNull Object object) {
        return POSITION_NONE;
    }
}
