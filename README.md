# Farlands-Reborn
Brings back the farlands in modern versions (1.18.x and above) by removing the patches that removed the farlands.
## What I did:
Used mixins to change the return value of maintainPrecision() in OctavePerlinNoiseSampler.java from <br>
<code> return value - (double)MathHelper.lfloor(value / 3.3554432E7 + 0.5) * 3.3554432E7; </code> <br>
to <br>
<code> return value; </code>
