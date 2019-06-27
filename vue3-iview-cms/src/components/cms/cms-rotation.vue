<style>
    .demo-carousel{
        margin: 0px auto;
        height: 200px;
        width: 700px;
        background-color: blanchedalmond;
        padding-top: 70px;
        font-size: 30px;
        line-height: 50px;
    }
</style>

<template>
    <Carousel v-model="imgSwitch"
                :autoplay="setting.autoplay"
                :autoplay-speed="setting.autoplaySpeed"
                :dots="setting.dots"
                :radius-dot="setting.radiusDot"
                :trigger="setting.trigger"
                :arrow="setting.arrow">
        <CarouselItem>
            <div class="demo-carousel">1</div>
        </CarouselItem>
        <CarouselItem>
            <div class="demo-carousel">2</div>
        </CarouselItem>
        <CarouselItem>
            <div class="demo-carousel">3</div>
        </CarouselItem>
        <CarouselItem>
            <div class="demo-carousel">4</div>
        </CarouselItem>
    </Carousel>
</template>
<script>
    export default {
        data () {
            return {
                imgSwitch: 0,
                setting: {
                    autoplay: true,
                    autoplaySpeed: 3000,
                    dots: 'outside',
                    radiusDot: false,
                    trigger: 'click',
                    arrow: 'hover'
                }
            }
        }
    }
</script>