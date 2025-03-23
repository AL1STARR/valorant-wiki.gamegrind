        let lastScrollTop = 0;
        const header = document.querySelector('.header');

        window.addEventListener('scroll', () => {
            const currentScroll = window.pageYOffset;

            if (currentScroll <= 0) {
                header.classList.remove('hidden');
            } else if (currentScroll > lastScrollTop && currentScroll > header.offsetHeight) {
                header.classList.add('hidden');
            } else if (currentScroll < lastScrollTop) {
                header.classList.remove('hidden');
            }
            lastScrollTop = currentScroll;
        });
