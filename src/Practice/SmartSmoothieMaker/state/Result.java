package Practice.SmartSmoothieMaker.state;

import Practice.SmartSmoothieMaker.smoothie.Smoothie;

public record Result(Smoothie smoothie, boolean success) {
}